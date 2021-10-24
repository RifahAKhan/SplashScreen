package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CreateAccount2ndclass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account2ndclass)
    }
    fun callNextCreateAccountScreen(view: View) {

    }

    fun callFirstScreen(view: View){
        startActivity(Intent(this@CreateAccount2ndclass,MainActivity::class.java))
    }
}