package com.smile.onlineservices.data.repository

import com.land.services.data.model.response.settings.SettingsResponse
import com.smile.onlineservices.data.network.ServiceApi
import io.reactivex.Flowable
import javax.inject.Inject


class RemoteRepository @Inject constructor(private val serviceApi: ServiceApi) {


    fun getSettings(): Flowable<SettingsResponse> {
        return serviceApi.getSettings()
    }

//    fun signUpUser(myMap: Map<String, String>): Flowable<UserSignUpResponse> {
//        return serviceApi.signUpUser(myMap)
//    }
//
//    fun getCities(): Flowable<CitiesResponse> {
//        return serviceApi.getCities()
//    }
//
//    fun signUpProvider(myMap: Map<String, String>): Flowable<ProviderSignUpResponse> {
//        return serviceApi.signUpProvider(myMap)
//    }
//
//    fun login(myMap: Map<String, String>): Flowable<LoginResponse> {
//        return serviceApi.login(myMap)
//    }
//
//    fun getSlider(): Flowable<SliderResponse> {
//        return serviceApi.getSlider()
//    }
//
//    fun getReviews(token: String, id: String): Flowable<ReviewsResponse> {
//        return serviceApi.getReviews(token, id)
//    }
//
//    fun getServices(): Flowable<ServicesResponse> {
//        return serviceApi.getServices()
//    }
//
//    fun search(token: String, key: String): Flowable<SearchResponse> {
//        return serviceApi.search(token, key)
//    }
//
//    fun getUserProfile(token: String, id: String): Flowable<ProfileResponse> {
//        return serviceApi.getUserProfile(token, id)
//    }
//
//    fun editUserProfile(token: String, myMap: Map<String, String>): Flowable<UpdateUserProfile> {
//        return serviceApi.updateUserProfile(token, myMap)
//    }
//
//    fun contactUs(myMap: Map<String, String>): Flowable<ContactUsResponse> {
//        return serviceApi.contactUs(myMap)
//    }
//
//    fun addReview(token: String, myMap: Map<String, Any>): Flowable<AddReviewResponse> {
//        return serviceApi.addReview(token, myMap)
//    }
//
//    fun logout(token: String, myMap: Map<String, Any>): Flowable<LogoutResponse> {
//        return serviceApi.logout(token, myMap)
//    }
//
//    fun updateToken(myMap: Map<String, Any>): Flowable<UpdateTokenResponse> {
//        return serviceApi.updateToken(myMap)
//    }
//
//    fun increaseCount(token: String, myMap: Map<String, Any>): Flowable<EditUserProfileResponse> {
//        return serviceApi.increaseCount(token, myMap)
//    }
//
//    fun deleteImage(token: String, myMap: Map<String, Any>): Flowable<DeleteImageResponse> {
//        return serviceApi.deleteImage(token, myMap)
//    }
//
//    fun addService(token: String, myMap: Map<String, Any>): Flowable<AddServiceResponse> {
//        return serviceApi.addService(token, myMap)
//    }
//
//    fun changeWorkDates(token: String, myMap: Map<String, Any>): Flowable<EditUserProfileResponse> {
//        return serviceApi.changeWorkDates(token, myMap)
//    }
//
//    fun getNotifications(token: String, id: String): Flowable<NotificationResponse> {
//        return serviceApi.getNotifications(token, id)
//    }
//
//    fun createAds(token: String, user_id: RequestBody, title: RequestBody, content: RequestBody, image: MultipartBody.Part?): Flowable<CreateAdResponse> {
//        return serviceApi.createAds(token, user_id, title, content, image)
//    }
//
//    fun createQuestion(token: String, user_id: RequestBody, content: RequestBody, image: MultipartBody.Part?): Flowable<CreateAdResponse> {
//        return serviceApi.createQuestion(token, user_id, content, image)
//    }
//
//    fun updateAd(token: String, id: RequestBody, user_id: RequestBody, title: RequestBody, content: RequestBody, image: MultipartBody.Part?): Flowable<UpdateAd> {
//        return serviceApi.updateAd(token, id, user_id, title, content, image)
//    }
//
//    fun updateQuestion(token: String, id: RequestBody, user_id: RequestBody, content: RequestBody, image: MultipartBody.Part?): Flowable<UpdateQuesstion> {
//        return serviceApi.updateQuestion(token, id, user_id, content, image)
//    }
//
//    fun getAds(pagination: String, limit: Int): Flowable<AdsResponse> {
//        return serviceApi.getAds(pagination, limit)
//    }
//
//    fun getQuestions(pagination: String, limit: Int): Flowable<QuestionsResponse> {
//        return serviceApi.getQuestions(pagination, limit)
//    }
//
//    fun getComments(id: String): Flowable<CommentsResponse> {
//        return serviceApi.getComments(id)
//    }
//
//    fun addComment(token: String, myMap: Map<String, Any>): Flowable<AddCommentResponse> {
//        return serviceApi.addComment(token, myMap)
//    }
//
//    fun getMyAds(id: String, pagination: String, limit: Int): Flowable<MyAds> {
//        return serviceApi.getMyAds(id, pagination, limit)
//    }
//
//    fun deleteAd(token: String, myMap: Map<String, Any>): Flowable<DeleteAd> {
//        return serviceApi.deleteAd(token, myMap)
//    }
//
//    fun deleteQuestion(token: String, myMap: Map<String, Any>): Flowable<DeleteQuestion> {
//        return serviceApi.deleteQuestion(token, myMap)
//    }
//
//    fun deleteComment(token: String, myMap: Map<String, Any>): Flowable<DeleteQuestion> {
//        return serviceApi.deleteComment(token, myMap)
//    }
//
//    fun getUnReadNotifications(token: String, id: String): Flowable<UnReadNotificationCountResponse> {
//        return serviceApi.getUnReadNotifications(token, id)
//    }
//
//    fun getSettings(): Flowable<SettingsResponse> {
//        return serviceApi.getSettings()
//    }
//
//    fun getSubServices(id: String): Flowable<SubServicesResponse> {
//        return serviceApi.getSubServices(id)
//    }
//
//    fun getProviders(id: String): Flowable<ProvidersResponse> {
//        return serviceApi.getProviders(id)
//    }
//
//    fun updateProfile(token: String, id: RequestBody, file: MultipartBody.Part): Flowable<EditUserProfileResponse> {
//        return serviceApi.updatePicture(token = token, user_id = id, logo = file)
//    }
//
//    fun uploadProviderImage(token: String, id: RequestBody, file: MultipartBody.Part): Flowable<EditUserProfileResponse> {
//        return serviceApi.uploadProviderImage(token = token, user_id = id, image = file)
//    }


//    fun signUp(myMap: Map<String, String>): Flowable<SignUpResponse> {
//        return serviceApi.signUp(myMap)
//    }
//
//    fun login(myMap: Map<String, String>): Flowable<LoginResponse> {
//        return serviceApi.login(myMap)
//    }
//
//    fun getArticles(token: String?): Flowable<ArticlesResponse> {
//        return serviceApi.getArticles("Bearer $token")
//    }
//
//    fun getArticle(token: String?, id: Int): Flowable<ArticleResponse> {
//        return serviceApi.getArticle("Bearer $token", id)
//    }
//
//
//    fun addLike(token: String?, id: Int): Flowable<LikeResponse> {
//        return serviceApi.addLike("Bearer $token", id)
//    }
//
//    fun getQuestions(token: String?): Flowable<QuestionsResponse> {
//        return serviceApi.getQuestions("Bearer $token")
//    }
//
//    fun getMubadraat(token: String?, category: String): Flowable<MubadraatResponse> {
//        return serviceApi.getMubadraat("Bearer $token", category)
//    }
//
//
//    fun getWebsites(token: String?, type: String, page: Int): Flowable<WebsiteResponse> {
//        return serviceApi.getWebsites("Bearer $token", type, page)
//    }

//    fun setSpin(myMap: Map<String, Int>, token: String): Flowable<SetSpinResponse> {
//        return serviceApi.setSpin(myMap, "Bearer $token")
//    }
//
//    fun withdraw(myMap: Map<String, Any>, token: String): Flowable<WithdrawResponse> {
//        return serviceApi.withdraw(myMap, "Bearer $token")
//    }
//
//    fun getWithdrawList(token: String?): Flowable<GetLastWithdrawResponse> {
//        return serviceApi.getWithdrawList("Bearer $token")
//    }
//
//    fun paymentMethods(token: String?): Flowable<PaymentMethodsResponse> {
//        return serviceApi.paymentMethods("Bearer $token")
//    }
//
//    fun getReferralList(token: String?): Flowable<GetReferralsResponse> {
//        return serviceApi.getReferralList("Bearer $token")
//    }
//
//    fun submitList(phone: String, password: String): Flowable<String> {
//        return serviceApi.submitList(phone, password)
//    }

}