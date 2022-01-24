package com.smile.onlineservices.view.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.land.services.data.model.response.settings.SettingsResponse
import com.smile.onlineservices.data.repository.RemoteRepository
import com.smile.onlineservices.utils.BaseSchedulerProvider
import com.smile.onlineservices.utils.BaseViewModel
import com.smile.onlineservices.utils.ViewState
import retrofit2.HttpException
import javax.inject.Inject


class BaseViewModel @Inject constructor(
    baseSchedulerProvider: BaseSchedulerProvider, private val repository: RemoteRepository
) : BaseViewModel(baseSchedulerProvider) {

    fun getSettings(): LiveData<ViewState<SettingsResponse>> {

        val data = MutableLiveData<ViewState<SettingsResponse>>()

        execute(
            loadingConsumer = {
                data.postValue(
                    ViewState.loading()
                )
            },
            successConsumer = { response ->
                response?.let {
                    data.postValue(
                        ViewState.success(it)
                    )
                }
            },
            throwableConsumer = { throwable ->
                data.postValue(
                    ViewState.error(handleError(throwable))
                )
            },
            useCase = repository.getSettings()
        )

        return data
    }

    private fun handleError(throwable: Throwable): String {
        return if (throwable is HttpException) {
            when (throwable.code()) {
                400 -> {
                    "Wrong Username or Password"
                }
                403 -> {
                    "You should login"
                }
                500 -> {
                    "Something went wrong"
                }
                else -> {
                    throwable.message!!
                }
            }
        } else {
            throwable.message!!
        }
    }

}