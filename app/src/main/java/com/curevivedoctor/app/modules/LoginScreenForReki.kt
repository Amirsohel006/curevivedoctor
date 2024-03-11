package com.curevivedoctor.app.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.rekihomecontainer.RekiHomeContainer

class LoginScreenForReki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen_for_reki)

        val loginButton:AppCompatButton=findViewById(R.id.btnLogin)
        loginButton.setOnClickListener {
            val i=Intent(this,RekiHomeContainer::class.java)
            startActivity(i)
        }
        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }
}