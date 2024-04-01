package com.curevivedoctor.app.modules.recentdoctors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.doctorvideocall.DoctorVideoCall

class RecentDoctors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent_doctors)
        val backImageView:ImageView=findViewById(R.id.toolbar)
        val viewdetails:ImageView=findViewById(R.id.byclick)

        backImageView.setOnClickListener {
            this.finish()
        }


        viewdetails.setOnClickListener {
            val i=Intent(this,DoctorVideoCall::class.java)
            startActivity(i)
        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }
}