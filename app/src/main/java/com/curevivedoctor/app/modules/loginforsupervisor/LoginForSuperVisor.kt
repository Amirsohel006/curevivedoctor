package com.curevivedoctor.app.modules.loginforsupervisor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.containerforsupervisor.HomeContainerForSupervisor
import com.curevivedoctor.app.modules.rekihomecontainer.RekiHomeContainer

class LoginForSuperVisor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_for_super_visor)

        val loginButton: AppCompatButton =findViewById(R.id.btnLogin)
        loginButton.setOnClickListener {
            val i= Intent(this, HomeContainerForSupervisor::class.java)
            startActivity(i)
        }
        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }
}