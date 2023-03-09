package com.kooapps.stackybirda.jsiiauhw
import android.webkit.WebSettings
import android.app.Application
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject




class Soaiuxygxcs(sauhhuxjizj: Application): ViewModel() {
    val bokvbkokovcji = sauhhuxjizj.packageManager





    fun hdsijisjdjiwjiijs(mokxkkocxjijidfji: WebView): WebSettings{
        val gzgtchusahu = mokxkkocxjijidfji.settings
        gzgtchusahu.allowContentAccess = true
        gzgtchusahu.allowFileAccess = true
        gzgtchusahu.allowFileAccess = true
        gzgtchusahu.javaScriptEnabled = true
        gzgtchusahu.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gzgtchusahu.domStorageEnabled = true


        gzgtchusahu.cacheMode = WebSettings.LOAD_DEFAULT
        gzgtchusahu.setSupportMultipleWindows(false)
        gzgtchusahu.useWideViewPort = true

        gzgtchusahu.pluginState = WebSettings.PluginState.ON
        gzgtchusahu.displayZoomControls = false
        gzgtchusahu.mediaPlaybackRequiresUserGesture = false
        gzgtchusahu.loadWithOverviewMode = true
        gzgtchusahu.javaScriptCanOpenWindowsAutomatically = true
        gzgtchusahu.builtInZoomControls = true
        gzgtchusahu.userAgentString = gzgtchusahu.userAgentString.replace("; wv", "")
        gzgtchusahu.allowContentAccess = true

        gzgtchusahu.setSupportZoom(true)
        return gzgtchusahu
    }



    fun plsaplkookxzc(cgyxjixji: String): Boolean {
        try {
            bokvbkokovcji.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun wyqokqokosijxzc(teiuwijjiw: String) {
        OneSignal.setExternalUserId(
            teiuwijjiw,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(kckixjuhhxd: JSONObject) {
                    try {
                        if (kckixjuhhxd.has("push") && kckixjuhhxd.getJSONObject("push").has("success")) {
                            val fokeokkowok = kckixjuhhxd.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $fokeokkowok"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (kckixjuhhxd.has("email") && kckixjuhhxd.getJSONObject("email").has("success")) {
                            val bxcokkoxokxijudhfhu =
                                kckixjuhhxd.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bxcokkoxokxijudhfhu"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (kckixjuhhxd.has("sms") && kckixjuhhxd.getJSONObject("sms").has("success")) {
                            val aplplpsplxokzcjijizx = kckixjuhhxd.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $aplplpsplxokzcjijizx"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }






}