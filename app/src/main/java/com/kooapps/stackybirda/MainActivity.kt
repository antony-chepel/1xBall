package com.kooapps.stackybirda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirda.jsiiauhw.Fwopqoqosd
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val ijxjizcokoks by viewModel<Fwopqoqosd>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ijxjizcokoks.yioocxkoijjugydgy(this)
    }
}