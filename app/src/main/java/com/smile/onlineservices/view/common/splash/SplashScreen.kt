package com.smile.onlineservices.view.common.splash

import android.app.AlertDialog
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.land.services.data.model.response.settings.SettingsResponse
import com.smile.onlineservices.BuildConfig
import com.smile.onlineservices.R
import com.smile.onlineservices.data.Constants
import com.smile.onlineservices.data.Constants.CLIENT
import com.smile.onlineservices.data.Constants.USERTYPE
import com.smile.onlineservices.data.Constants.advanced_ad
import com.smile.onlineservices.data.Constants.banner_ad
import com.smile.onlineservices.utils.LocaleHelper
import com.smile.onlineservices.utils.ViewState
import com.smile.onlineservices.view.common.base.BaseViewModel
import com.smile.onlineservices.view.common.login.LoginScreen
import com.smile.onlineservices.view.provider.home.ProviderHomeScreen
import com.smile.onlineservices.view.user.home.UserHomeScreen
import dagger.android.support.DaggerAppCompatActivity
import dmax.dialog.SpotsDialog
import kotlinx.android.synthetic.main.screen_splash.*
import javax.inject.Inject

class SplashScreen : DaggerAppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    private lateinit var dialog: AlertDialog

    @Inject
    lateinit var baseViewModel: BaseViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_splash)


        dialog = SpotsDialog.Builder()
            .setContext(this)
            .setMessage("Please Wait...")
            .build()

        configViewModel()
        getSettings()

    }

    private fun configViewModel() {
        baseViewModel = ViewModelProviders.of(this, viewModelFactory).get(BaseViewModel::class.java)
    }

    private fun getSettings() {

        baseViewModel.getSettings().observe(this,
            Observer<ViewState<SettingsResponse>>
            { viewState ->
                when (viewState.status) {
                    ViewState.Status.LOADING -> {
                        dialog.show()
                    }

                    ViewState.Status.SUCCESS -> {
                        dialog.dismiss()
                        if (viewState.data!!.status == 200) {
                            if (viewState.data.data.appVersion != 2) {
                                showAlertDialogAndOpenAppStore("يوجد إصدار جديد من التطبيق متاح الأن، يرجي التحديث لضمان الاستخدام الأمثل لخدمات التطبيق")
                            } else {
                                if (!BuildConfig.DEBUG){
                                    banner_ad = viewState.data.data.banner_ad
                                    advanced_ad = viewState.data.data.advanced_ad
                                }


                                Handler().postDelayed({

                                    if (sharedPreferences.getString(Constants.USERSTATUS, "false") == "true") {
                                        if (sharedPreferences.getString(USERTYPE, CLIENT) == CLIENT) {
                                            startActivity(Intent(this@SplashScreen, UserHomeScreen::class.java))
                                            finish()
                                        } else {
                                            startActivity(
                                                Intent(
                                                    this@SplashScreen,
                                                    ProviderHomeScreen::class.java
                                                )
                                            )
                                            finish()
                                        }
                                    } else {
                                        startActivity(
                                            Intent(
                                                this@SplashScreen,
                                                LoginScreen::class.java
                                            )
                                        )
                                        finish()
                                    }

                                }, 2000)
                            }

                        } else {
                            Toast.makeText(baseContext, "Error", Toast.LENGTH_LONG).show()
                        }
                    }

                    ViewState.Status.ERROR -> {
                        dialog.dismiss()
                        Toast.makeText(baseContext, "${viewState.message}", Toast.LENGTH_LONG)
                            .show()
                    }
                }
            }
        )
    }

    private fun showAlertDialogAndOpenAppStore(message: String) {

        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("تحديث متوفر")
        alertDialog.setMessage(message)
        alertDialog.setCancelable(false)
        alertDialog.setButton(
            AlertDialog.BUTTON_NEUTRAL, "تحديث"
        ) { dialog, _ ->
            dialog.dismiss()

            val appPackageName =
                this.packageName// getPackageName() from Context or Activity object
            try {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=$appPackageName")
                    )
                )
            } catch (anfe: android.content.ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")
                    )
                )
            }
        }
        alertDialog.show()
    }

    override fun onStart() {
        super.onStart()
        LocaleHelper().setLocale(this, "ar")
    }
}

//ca-app-pub-7622562892222030~4685211930

//banner
//ca-app-pub-7622562892222030/9187547819

//Interstitial
//ca-app-pub-7622562892222030/6836377332