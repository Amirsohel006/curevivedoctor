package com.curevivedoctor.app.modules.treatmentcardfordoctor

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.curevivedoctor.app.R

class TreatmentCardForDocotors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment_card_for_docotors)


        val backButton:ImageView=findViewById(R.id.imageArrowleft)
        backButton.setOnClickListener {
            this.finish()
        }

        val btnChiefbutton:AppCompatButton=findViewById(R.id.btnChief)
        btnChiefbutton.setOnClickListener {
            val dialogBinding =
                LayoutInflater.from(this).inflate(R.layout.activity_personal_history, null)
            val myDialoge = Dialog(this)
            myDialoge.setContentView(dialogBinding)

//            val img=dialogBinding.findViewById<ImageView>(R.id.imageComponentlott)
//            val img1=dialogBinding.findViewById<ImageView>(R.id.imageHttpslottief)
//
//            val btnGOCart=dialogBinding.findViewById<AppCompatButton>(R.id.btnCart)
//
//            Glide.with(itemView.context).load(R.drawable.done).into(img)
//            Glide.with(itemView.context).load(R.drawable.celebration).into(img1)
//            btnGOCart.setOnClickListener{
//                // This code will run after 3 seconds
//                val i= Intent(itemView.context,MDetailBuyActivity::class.java)
//                i.putExtra("eventId",list.event!!.id)
//                itemView.context.startActivity(i)
//                myDialoge.dismiss()
//            }


            myDialoge.setCancelable(true)
            myDialoge.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialoge.show()
        }


        val btnPastHistory:AppCompatButton=findViewById(R.id.btnPastHistory)
        btnPastHistory.setOnClickListener {
            val dialogBinding =
                LayoutInflater.from(this).inflate(R.layout.activity_dialogue_for_treatment_card, null)
            val myDialoge = Dialog(this)
            myDialoge.setContentView(dialogBinding)

            val img=dialogBinding.findViewById<ImageView>(R.id.sclose)
//            val img1=dialogBinding.findViewById<ImageView>(R.id.imageHttpslottief)
//
//            val btnGOCart=dialogBinding.findViewById<AppCompatButton>(R.id.btnCart)
//
//            Glide.with(itemView.context).load(R.drawable.done).into(img)
//            Glide.with(itemView.context).load(R.drawable.celebration).into(img1)
            img.setOnClickListener{
                // This code will run after 3 seconds
                myDialoge.dismiss()
            }
            myDialoge.setCancelable(true)
            myDialoge.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialoge.show()
        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }
}