package com.curevivedoctor.app.modules.rekipateintlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R

class RakiPateintList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContentView(R.layout.activity_raki_pateint_list)


        val backImage:ImageView=findViewById(R.id.imageArrowleftOne)
        backImage.setOnClickListener {
            this.finish()
        }
        val spinner1:Spinner=findViewById(R.id.spinnerTime)
        val spinner2:Spinner=findViewById(R.id.spinnerTime1)
        val spinner3:Spinner=findViewById(R.id.spinnerTime2)
        val spinner4:Spinner=findViewById(R.id.spinnerTime3)

        // Create an array of time values
        val timeValues = arrayOf("8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
            "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM")

        // Create an ArrayAdapter using the timeValues array and a default spinner layout
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, timeValues)

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Set the adapter to each spinner
        spinner1.adapter = adapter
        spinner2.adapter = adapter
        spinner3.adapter = adapter
        spinner4.adapter = adapter

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)

    }
}