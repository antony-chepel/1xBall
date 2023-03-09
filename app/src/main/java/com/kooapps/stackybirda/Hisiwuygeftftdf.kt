package com.kooapps.stackybirda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirda.databinding.ActivityHisiwuygeftftdfBinding
import com.kooapps.stackybirda.jsiiauhw.Iywgtfsftxczxxcsdd

class Hisiwuygeftftdf : AppCompatActivity() {
    private lateinit var juhxcjiijs : ActivityHisiwuygeftftdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        juhxcjiijs = ActivityHisiwuygeftftdfBinding.inflate(layoutInflater)
        setContentView(juhxcjiijs.root)

        juhxcjiijs.bStrtXb.setOnClickListener {
            startActivity(Intent(this,Iywgtfsftxczxxcsdd::class.java))
        }
    }


}