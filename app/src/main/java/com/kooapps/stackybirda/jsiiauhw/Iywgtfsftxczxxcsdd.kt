package com.kooapps.stackybirda.jsiiauhw

import android.content.Intent
import android.graphics.Point
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kooapps.stackybirda.Jsuhuhaygxtftzfc
import com.kooapps.stackybirda.R
import java.util.*

class Iywgtfsftxczxxcsdd : AppCompatActivity() {


    private  var gofk:ImageView? = null
    private  var sdowk:ImageView? = null
    private  var vcjkbji:Float = 0f
    private var fprllpe = 0f
    private  var spwllpslpdlpsadp:Float = 0f
    private  var fokdkog:ImageView? = null
    private var ixjzcjizxji = 0
    private var dpeplwp = 0

    private var sdkowko = 0
    private var sokosdkoxcjizxcji = 0
    private var bjihjig = 0f
    private var sioajixjicijzcji: TextView? = null
    private var xcvjid: TextView? = null
    private var sodksokkoxkocok: ImageView? = null
    private var cokvok: Timer? = Timer()
    private val fofkdko = Handler()
    private var dpleplq = 0f
    private  var dsijfjijicijvij:Float = 0f
    private var pallppslppxlclp = 0f

    private var gokkovckob = 0
    private var plslpwp = 0
    private var dsopfdko = 0
    private var sokosdk = false
    private var fokckoxv = false
    private var vcjibjivb = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iywgtfsftxczxxcsdd)
        sioajixjicijzcji = findViewById(R.id.scoreLabel)
        xcvjid = findViewById(R.id.startLabel)
        sodksokkoxkocok = findViewById(R.id.box)
        gofk = findViewById<ImageView>(R.id.orange)
        sdowk = findViewById<ImageView>(R.id.pink)
        fokdkog = findViewById<ImageView>(R.id.black)

        val soadk = windowManager
        val cokxvkodkosko = soadk.defaultDisplay
        val sdokw = Point()
        cokxvkodkosko.getSize(sdokw)
        ixjzcjizxji = sdokw.x
        val xokczko = sdokw.y


        gokkovckob = Math.round(xokczko / 60.0f)
        plslpwp = Math.round(ixjzcjizxji / 60.0f)
        dsopfdko = Math.round(ixjzcjizxji / 36.0f)
        vcjibjivb = Math.round(ixjzcjizxji / 45.0f)

        gofk!!.setX(-80.0f)
        gofk!!.setY(-80.0f)
        sdowk!!.setX(-80.0f)
        sdowk!!.setY(-80.0f)
        fokdkog!!.setX(-80.0f)
        fokdkog!!.setY(-80.0f)

        sioajixjicijzcji!!.text = "Score : $sdkowko"
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (!fokckoxv) {
            fokckoxv = true


            val hvcygb = findViewById<FrameLayout>(R.id.frame)
            dpeplwp = hvcygb.height


            bjihjig = sodksokkoxkocok!!.y
            sokosdkoxcjizxcji = sodksokkoxkocok!!.height
            xcvjid!!.visibility = View.GONE
            cokvok!!.schedule(object : TimerTask() {
                override fun run() {
                    fofkdko.post { fokkoxckovko() }
                }
            }, 0, 20)
        } else {
            if (event.action == MotionEvent.ACTION_DOWN) {
                sokosdk = true
            } else if (event.action == MotionEvent.ACTION_UP) {
                sokosdk = false
            }
        }
        return super.onTouchEvent(event)
    }

    fun fokkoxckovko() {
        gkokovkocb()

        dpleplq -= plslpwp.toFloat()
        if (dpleplq < 0) {
            dpleplq = (ixjzcjizxji + 20).toFloat()
            dsijfjijicijvij = Math.floor(Math.random() * (dpeplwp - gofk!!.getHeight())).toFloat()
        }
        gofk!!.setX(dpleplq)
        gofk!!.setY(dsijfjijicijvij)


        fprllpe -= vcjibjivb.toFloat()
        if (fprllpe < 0) {
            fprllpe = (ixjzcjizxji + 10).toFloat()
            spwllpslpdlpsadp = Math.floor(Math.random() * (dpeplwp - fokdkog!!.getHeight())).toFloat()
        }
        fokdkog!!.setX(fprllpe)
        fokdkog!!.setY(spwllpslpdlpsadp)


        pallppslppxlclp -= dsopfdko.toFloat()
        if (pallppslppxlclp < 0) {
            pallppslppxlclp = (ixjzcjizxji + 5000).toFloat()
            vcjkbji = Math.floor(Math.random() * (dpeplwp - sdowk!!.getHeight())).toFloat()
        }
        sdowk!!.setX(pallppslppxlclp)
        sdowk!!.setY(vcjkbji)


        if (sokosdk) {

            bjihjig -= gokkovckob.toFloat()
        } else {

            bjihjig += gokkovckob.toFloat()
        }
        if (bjihjig < 0) bjihjig = 0f
        if (bjihjig > dpeplwp - sokosdkoxcjizxcji) bjihjig = (dpeplwp - sokosdkoxcjizxcji).toFloat()
        sodksokkoxkocok!!.y = bjihjig

        sioajixjicijzcji!!.text = "Score : $sdkowko"
    }

    fun gkokovkocb() {


        val yokokfkodgko: Float = dpleplq + gofk!!.getWidth() / 2.0f
        val dkofoke: Float = dsijfjijicijvij + gofk!!.getHeight() / 2.0f
        if (0 <= yokokfkodgko && yokokfkodgko <= sokosdkoxcjizxcji && bjihjig <= dkofoke && dkofoke <= bjihjig + sokosdkoxcjizxcji) {
            dpleplq = -100.0f
            sdkowko += 10
        }


        val icjvij: Float = pallppslppxlclp + sdowk!!.getWidth() / 2.0f
        val dplwpqlplp: Float = vcjkbji + sdowk!!.getHeight() / 2.0f
        if (0 <= icjvij && icjvij <= sokosdkoxcjizxcji && bjihjig <= dplwpqlplp && dplwpqlplp <= bjihjig + sokosdkoxcjizxcji) {
            pallppslppxlclp = -100.0f
            sdkowko += 30
        }


        val cxvyuhhudhu: Float = fprllpe + fokdkog!!.getWidth() / 2.0f
        val sodkkow: Float = spwllpslpdlpsadp + fokdkog!!.getHeight() / 2.0f
        if (0 <= cxvyuhhudhu && cxvyuhhudhu <= sokosdkoxcjizxcji && bjihjig <= sodkkow && sodkkow <= bjihjig + sokosdkoxcjizxcji) {



            if (cokvok != null) {
                cokvok!!.cancel()
                cokvok = null
            }

            val intent = Intent(applicationContext, Jsuhuhaygxtftzfc::class.java)
            intent.putExtra("X_SCORE", sdkowko)
            startActivity(intent)
        }
    }

}