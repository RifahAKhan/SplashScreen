package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.CollapsibleActionView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val next : Button = findViewById(R.id.signup_next_button)
        val createAccount : Button = findViewById(R.id.create_account_button)
        val titleText : TextView = findViewById(R.id.login_title_text)


    }

    fun callNextCreateAccountScreen(view: View){

    }

    fun callNextScreen(view: View){

    }

}