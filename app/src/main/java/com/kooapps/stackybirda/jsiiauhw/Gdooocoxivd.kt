package com.kooapps.stackybirda.jsiiauhw
import android.net.Uri
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import java.util.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Looper
import android.os.Environment
import com.kooapps.stackybirda.Opwoiuxycx.fplplsdplp
import com.kooapps.stackybirda.Opwoiuxycx.rxrzcrs
import android.os.Handler
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.kooapps.stackybirda.Opwoiuxycx.sasoakkoxko
import java.text.SimpleDateFormat

import android.webkit.*
import android.util.Log
import android.provider.MediaStore
import android.os.Bundle







class Gdooocoxivd : AppCompatActivity() {
    var cxtvftd = ""
    private var rplepl = false
    lateinit var plaslpdplw: WebView
    private var pcxollijjiv: ValueCallback<Array<Uri>>? = null
    private  val frkoeko = 1
    private var ygzxtfc: String? = null
    private val qpllpalpsplpslaplx by viewModel<Soaiuxygxcs>(
        named("BeamModel")
    )

    override fun onBackPressed() {

        if (plaslpdplw.canGoBack()) {
            if (rplepl) {
                plaslpdplw.stopLoading()
                plaslpdplw.loadUrl(cxtvftd)
            }
            this.rplepl = true
            plaslpdplw.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                rplepl = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(odkokokok: Int, dpleplwp: Int, ncxvjidji: Intent?) {

        if (odkokokok != frkoeko || pcxollijjiv == null) {
            super.onActivityResult(odkokokok, dpleplwp, ncxvjidji)
            return
        }
        var tsraixjc: Array<Uri>? = null

        if (dpleplwp == RESULT_OK) {
            if (ncxvjidji == null) {
                if (ygzxtfc != null) {
                    tsraixjc = arrayOf(Uri.parse(ygzxtfc))
                }
            } else {
                val lcxlovkjid = ncxvjidji.dataString
                if (lcxlovkjid != null) {
                    tsraixjc = arrayOf(Uri.parse(lcxlovkjid))
                }
            }
        }
        pcxollijjiv!!.onReceiveValue(tsraixjc)
        pcxollijjiv = null
        return
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        plaslpdplw = WebView(this)
        setContentView(plaslpdplw)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(plaslpdplw, true)
        qpllpalpsplpslaplx.hdsijisjdjiwjiijs(plaslpdplw)

        plaslpdplw.webViewClient = Foekwokoksod()
        plaslpdplw.webChromeClient = Rqoqkokkoskxijijc()
        plaslpdplw.loadUrl(xizjcjijijizzlkookkosokad())
    }




    fun yozoxkkookcks(repwl: String?) {
        if (!repwl!!.contains("t.me")) {

            if (cxtvftd == "") {
                cxtvftd = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    repwl
                ).toString()

                val chxokkoxkoijd = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val wplplqpl = chxokkoxkoijd.edit()
                wplplqpl.putString("SAVED_URL", repwl)
                wplplqpl.apply()
            }
        }
    }

    inner class Rqoqkokkoskxijijc : WebChromeClient() {

        override fun onShowFileChooser(
            gcuxh: WebView?,
            osppldokoxc: ValueCallback<Array<Uri>>?,
            vfokdosk: FileChooserParams?
        ): Boolean {
            pcxollijjiv?.onReceiveValue(null)
            pcxollijjiv = osppldokoxc
            var owpwposkodkox: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (owpwposkodkox!!.resolveActivity(packageManager) != null) {
                var dpsllpepl: File? = null
                try {
                    dpsllpepl = hkocooixj()
                    owpwposkodkox.putExtra("PhotoPath", ygzxtfc)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (dpsllpepl != null) {
                    ygzxtfc = "file:" + dpsllpepl.absolutePath
                    owpwposkodkox.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(dpsllpepl)
                    )
                } else {
                    owpwposkodkox = null
                }
            }
            val ccxjjivkokdo = Intent(Intent.ACTION_GET_CONTENT)
            ccxjjivkokdo.addCategory(Intent.CATEGORY_OPENABLE)
            ccxjjivkokdo.type = "image/*"
            val splwplq: Array<Intent?> = owpwposkodkox?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val txzyucuijzxijcijsji = Intent(Intent.ACTION_CHOOSER)
            txzyucuijzxijcijsji.putExtra(Intent.EXTRA_INTENT, ccxjjivkokdo)
            txzyucuijzxijcijsji.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            txzyucuijzxijcijsji.putExtra(Intent.EXTRA_INITIAL_INTENTS, splwplq)
            startActivityForResult(txzyucuijzxijcijsji, frkoeko)
            return true
        }

        fun hkocooixj(): File? {
            val eplwlpqp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val txzchuhusd = "JPEG_" + eplwlpqp + "_"
            val xpzocllzsjijdihu = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                txzchuhusd,
                ".jpg",
                xpzocllzsjijdihu
            )
        }
    }
    private fun xizjcjijijizzlkookkosokad(): String {
        val osidij = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val dpsllp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val wpqplqplpws = osidij.getString(rxrzcrs, null)
        val gcuh = osidij.getString(sasoakkoxko, null)
        val pwlplwplwplsokdok = osidij.getString(fplplsdplp, null)
        when (osidij.getString("WebInt", null)) {
            "campaign" -> {
                qpllpalpsplpslaplx.wyqokqokosijxzc(gcuh.toString())
            }
            "deepLink" -> {
                qpllpalpsplpslaplx.wyqokqokosijxzc(gcuh.toString())
            }
            "deepLinkNOApps" -> {
                qpllpalpsplpslaplx.wyqokqokosijxzc(wpqplqplpws.toString())
            }
            "geo" -> {
                qpllpalpsplpslaplx.wyqokqokosijxzc(wpqplqplpws.toString())
            }
        }
        return dpsllp.getString("SAVED_URL", pwlplwplwplsokdok).toString()
    }

    inner class Foekwokoksod: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (qpllpalpsplpslaplx.plsaplkookxzc(url)) {

                    val ncnxjkvijjfjig = Intent(Intent.ACTION_VIEW)
                    ncnxjkvijjfjig.data = Uri.parse(url)
                    startActivity(ncnxjkvijjfjig)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            yozoxkkookcks(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Gdooocoxivd, description, Toast.LENGTH_SHORT).show()
        }
    }






}

