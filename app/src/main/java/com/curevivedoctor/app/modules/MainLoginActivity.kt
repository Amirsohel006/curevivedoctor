package com.curevivedoctor.app.modules

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.loginwithselection.LoginWithSelection


class MainLoginActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        val loginButton:AppCompatButton=findViewById(R.id.btnLogin)

        loginButton.setOnClickListener {
            val i=Intent(this,LoginWithSelection::class.java)
            startActivity(i)
        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }


}