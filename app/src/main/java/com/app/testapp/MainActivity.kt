package com.app.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alizamani.mylibrary.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testVar="asfasf"
        testVar.log()
    }
}