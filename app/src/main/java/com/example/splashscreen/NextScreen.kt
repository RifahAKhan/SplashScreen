package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NextScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_screen)
    }
    fun callPreviousScreen(view: View) {
        startActivity(Intent(this@NextScreen,MainActivity::class.java))

    }
    fun callLoginScreen(view: View) {
        startActivity(Intent(this@NextScreen,MainActivity::class.java))

    }

}