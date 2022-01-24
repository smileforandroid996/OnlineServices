package com.smile.onlineservices.data



object Constants {


    const val ENCRYPT_KEY = "services@land$"
    const val PREFS_FILE  = "services_prefs"




    var isGuest = false
    var userId = ""

    //Test Ads
    var native_ad = ""
    var advanced_ad = "ca-app-pub-3940256099942544/1033173712"
    var banner_ad = "ca-app-pub-3940256099942544/6300978111"


    //Real Ads
//    var native_ad = ""
//    var advanced_ad = " ca-app-pub-4812103775910577/2094045560"
//    var banner_ad = "ca-app-pub-4812103775910577/9265958578"


    ///////////
    const val BASE_URL_PRODUCTION = "https://octoberservicesguide.com/api/"
//    const val BASE_URL_PRODUCTION = "http://134.209.225.101/api/"
    const val BASE_URL_DEVELOPMENT = "http://service.directsolutionstech.com/api/"
//    const val STORAGE = "http://134.209.225.101/storage/"
    const val STORAGE = "https://octoberservicesguide.com/storage/"
//    const val STORAGE = "http://service.directsolutionstech.com/storage/"
    const val ISFIRSTTIME = "isFirstTime"
    const val USERTYPE = "userType"
    const val CLIENT = "client"
    const val PROVIDER = "provider"
    const val USERID = "id"
    const val FULLNAME = "fullname"
    const val USERNAME = "username"
    const val PHOTO = "photo"
    const val ACCESS_TOKEN = "token"
    const val PHONE = "phone"
    const val EMAIL = "email"
    const val USERSTATUS = "userstatus"
    const val CITY = "city"
    const val AREA = "area"
    const val ABOUT = "about"

}