package com.kooapps.stackybirda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirda.databinding.ActivityJsuhuhaygxtftzfcBinding

class Jsuhuhaygxtftzfc : AppCompatActivity() {
    private lateinit var asdwijis : ActivityJsuhuhaygxtftzfcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        asdwijis = ActivityJsuhuhaygxtftzfcBinding.inflate(layoutInflater)
        setContentView(asdwijis.root)

        ysasdiaji()
    }


    private fun ysasdiaji() = with(asdwijis){
        val scrssd = intent.getIntExtra("X_SCORE",50)
        gyxcxjijixjijid.text = "You got $scrssd scores"
        coxkokcji.setOnClickListener {
            startActivity(Intent(this@Jsuhuhaygxtftzfc,Hisiwuygeftftdf::class.java))
        }

    }
}