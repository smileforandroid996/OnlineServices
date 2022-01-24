package com.smile.onlineservices.view.common.base

import androidx.lifecycle.ViewModel
import com.smile.onlineservices.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class BaseViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(BaseViewModel::class)
    abstract fun bindsViewModel(viewModel: BaseViewModel): ViewModel
}