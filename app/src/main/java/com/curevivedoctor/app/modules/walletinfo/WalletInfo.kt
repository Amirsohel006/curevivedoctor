package com.curevivedoctor.app.modules.walletinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R

class WalletInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet_info)
        val textView:TextView=findViewById(R.id.txtAnalysis)

        textView.setOnClickListener {
            this.finish()
        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbarwalle)
    }
}