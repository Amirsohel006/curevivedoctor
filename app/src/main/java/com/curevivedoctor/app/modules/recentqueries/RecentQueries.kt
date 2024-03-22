package com.curevivedoctor.app.modules.recentqueries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R

class RecentQueries : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent_queries)


        val textviewforqueries:TextView=findViewById(R.id.txtYourschedule)
        textviewforqueries.setOnClickListener {
            this.finish()
        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)

    }
}