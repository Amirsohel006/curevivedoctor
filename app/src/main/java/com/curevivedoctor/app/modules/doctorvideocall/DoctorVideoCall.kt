package com.curevivedoctor.app.modules.doctorvideocall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.treatmentcardfordoctor.TreatmentCardForDocotors

class DoctorVideoCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_video_call)

        val backImage:ImageView=findViewById(R.id.arrow_back)
        backImage.setOnClickListener {
            this.finish()
        }


        val framebackground:ImageView=findViewById(R.id.pateintclick)
        framebackground.setOnClickListener {
            val i=Intent(this,TreatmentCardForDocotors::class.java)
            startActivity(i)
        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)

    }
}