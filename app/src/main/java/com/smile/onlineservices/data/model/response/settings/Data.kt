package com.land.services.data.model.response.settings


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class Data(
    @SerializedName("about_app")
    val aboutApp: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("address1")
    val address1: String,
    @SerializedName("address2")
    val address2: String,
    @SerializedName("android_app")
    val androidApp: String,
    @SerializedName("app_version")
    val appVersion: Int,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("email1")
    val email1: String,
    @SerializedName("email2")
    val email2: Any,
    @SerializedName("facebook")
    val facebook: String,
    @SerializedName("fax")
    val fax: String,
    @SerializedName("google_plus")
    val googlePlus: String,
    @SerializedName("header_logo")
    val headerLogo: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("instagram")
    val instagram: String,
    @SerializedName("ios_app")
    val iosApp: String,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("linkedin")
    val linkedin: String,
    @SerializedName("login_banner")
    val loginBanner: Any,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("phone1")
    val phone1: String,
    @SerializedName("phone2")
    val phone2: String,
    @SerializedName("snapchat_ghost")
    val snapchatGhost: String,
    @SerializedName("telegram")
    val telegram: String,
    @SerializedName("termis_condition")
    val termisCondition: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("native_ad")
    val native_ad: String,
    @SerializedName("advanced_ad")
    val advanced_ad: String,
    @SerializedName("banner_ad")
    val banner_ad: String,
    @SerializedName("title_en")
    val titleEn: String,
    @SerializedName("twitter")
    val twitter: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("whatsapp")
    val whatsapp: String,
    @SerializedName("youtube")
    val youtube: String
)