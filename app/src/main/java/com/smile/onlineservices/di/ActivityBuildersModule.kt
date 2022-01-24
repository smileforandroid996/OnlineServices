package com.smile.onlineservices.di


import com.smile.onlineservices.view.common.base.BaseViewModelModule
import com.smile.onlineservices.view.common.splash.SplashScreen
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

//    @ContributesAndroidInjector(modules = [SignUpViewModelModule::class])
//    abstract fun contributeSignUpUserScreen(): SignUpUserScreen
//
//    @ContributesAndroidInjector(modules = [SignUpViewModelModule::class])
//    abstract fun contributeSignUpProviderScreen(): SignUpProviderScreen
//
//    @ContributesAndroidInjector(modules = [LoginViewModelModule::class])
//    abstract fun contributeLoginActivity(): LoginScreen
//
//    @ContributesAndroidInjector(modules = [UserHomeViewModelModule::class])
//    abstract fun contributeUserHomeScreen(): UserHomeScreen
//
//    @ContributesAndroidInjector(modules = [UserHomeViewModelModule::class])
//    abstract fun contributeHomeFragment(): HomeFragment
//
//    @ContributesAndroidInjector(modules = [AdsViewModelModule::class])
//    abstract fun contributeAdsFragment(): AdsFragment
//
//    @ContributesAndroidInjector(modules = [AskViewModelModule::class])
//    abstract fun contributeAskFragment(): AskFragment
//
//    @ContributesAndroidInjector(modules = [UserHomeViewModelModule::class])
//    abstract fun contributeProviderHomeScreen(): ProviderHomeScreen
//
//    @ContributesAndroidInjector(modules = [CommentsViewModelModule::class])
//    abstract fun contributeProviderCommentsActivity(): CommentsActivity
//
//    @ContributesAndroidInjector(modules = [AddQuestionViewModelModule::class])
//    abstract fun contributeProviderAddQuestionActivity(): AddQuestionActivity
//
//    @ContributesAndroidInjector(modules = [ProfileViewModelModule::class])
//    abstract fun contributeProviderProfileScreen(): ProviderProfileScreen
//
//    @ContributesAndroidInjector(modules = [ProfileViewModelModule::class])
//    abstract fun contributeAddServiceScreen(): AddServiceScreen
//
//    @ContributesAndroidInjector(modules = [BaseViewModelModule::class])
//    abstract fun contributeAboutAppScreen(): AboutAppScreen
//
//    @ContributesAndroidInjector(modules = [BaseViewModelModule::class])
//    abstract fun contributeTermsScreen(): TermsScreen
//
    @ContributesAndroidInjector(modules = [BaseViewModelModule::class])
    abstract fun contributeSplashScreen(): SplashScreen
//
//    @ContributesAndroidInjector()
//    abstract fun contributeBaseScreen(): BaseScreen
//
//    @ContributesAndroidInjector()
//    abstract fun contributeVerificationScreen(): VerificationScreen
//
//    @ContributesAndroidInjector(modules = [ProfileViewModelModule::class])
//    abstract fun contributeUserProfileScreen(): UserProfileScreen
//
//    @ContributesAndroidInjector(modules = [EditProfileViewModelModule::class])
//    abstract fun contributeUserEditProfileScreen(): UserEditProfileScreen
//
//    @ContributesAndroidInjector(modules = [ContactUsViewModelModule::class])
//    abstract fun contributeContactUsScreen(): ContactUsScreen
//
//    @ContributesAndroidInjector(modules = [NotificationViewModelModule::class])
//    abstract fun contributeNotificationScreen(): NotificationScreen
//
//    @ContributesAndroidInjector(modules = [AdsViewModelModule::class])
//    abstract fun contributeAdsScreen(): AdsScreen
//
//    @ContributesAndroidInjector(modules = [AddAdViewModelModule::class])
//    abstract fun contributeAddAdScreen(): AddAdScreen
//
//    @ContributesAndroidInjector(modules = [SubServicesViewModelModule::class])
//    abstract fun contributeSubServicesScreen(): SubServicesScreen
//
//    @ContributesAndroidInjector(modules = [ProvidersViewModelModule::class])
//    abstract fun contributeProvidersScreen(): ProvidersScreen
//
//    @ContributesAndroidInjector(modules = [ProvidersViewModelModule::class])
//    abstract fun contributeSearchScreen(): SearchScreen
//
//    @ContributesAndroidInjector(modules = [ProfileViewModelModule::class])
//    abstract fun contributeProviderDetailsScreen(): ProviderDetailsScreen
//
//    @ContributesAndroidInjector(modules = [ReviewsViewModelModule::class])
//    abstract fun contributeReviewsScreen(): ReviewsScreen


}