package com.kooapps.stackybirda
import android.app.Application
import org.koin.android.ext.koin.androidContext
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*
import android.content.Context
import com.kooapps.stackybirda.Opwoiuxycx.epllpqplpplsplokxkocko
import com.kooapps.stackybirda.Opwoiuxycx.rxrzcrs
import com.kooapps.stackybirda.Opwoiuxycx.uhcxhuvjijidv
import com.kooapps.stackybirda.Opwoiuxycx.ncnxbijijjihuuhhudshuf
import com.kooapps.stackybirda.jsiiauhw.ixzkkookoksokdok
import com.kooapps.stackybirda.jsiiauhw.dpelppqwplplsld


class Xpqppaoaaas: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ncnxbijijjihuuhhudshuf)

        val xiozcjisji = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val lpclplplpvkodjifjig = getSharedPreferences("PREFS_NAME", 0)

        val pwlpqpllpsko = MyTracker.getTrackerParams()
        val icjivjijiokkofkodgko = MyTracker.getTrackerConfig()
        val aplqpa = MyTracker.getInstanceId(this)
        icjivjijiokkofkodgko.isTrackingLaunchEnabled = true
        val ijijiijijcvbhuokokokof = UUID.randomUUID().toString()

        if (lpclplplpvkodjifjig.getBoolean("my_first_time", true)) {
            pwlpqpllpsko.setCustomUserId(ijijiijijcvbhuokokokof)
            xiozcjisji.edit().putString(rxrzcrs, ijijiijijcvbhuokokokof).apply()
            xiozcjisji.edit().putString(epllpqplpplsplokxkocko, aplqpa).apply()
            lpclplplpvkodjifjig.edit().putBoolean("my_first_time", false).apply()
        } else {
            val glrlpelpelp = xiozcjisji.getString(rxrzcrs, ijijiijijcvbhuokokokof)
            pwlpqpllpsko.setCustomUserId(glrlpelpelp)
        }
        MyTracker.initTracker(uhcxhuvjijidv, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Xpqppaoaaas)
            modules(
                listOf(
                    dpelppqwplplsld, ixzkkookoksokdok
                )
            )
        }
    }
}