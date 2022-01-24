package com.land.services.data.model.response.settings


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class SettingsResponse(
    @SerializedName("data")
    val data: Data,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int
)