package com.smile.onlineservices.app

import android.content.Context
import androidx.multidex.MultiDex
import com.google.android.gms.ads.MobileAds
import com.smile.onlineservices.di.AppComponent
import com.smile.onlineservices.di.DaggerAppComponent
import dagger.android.DaggerApplication

class OnlineServices: DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this){}
    }
    override fun applicationInjector(): AppComponent {
        return DaggerAppComponent.builder().application(this).build()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}