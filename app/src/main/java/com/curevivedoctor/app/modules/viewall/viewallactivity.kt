package com.curevivedoctor.app.modules.viewall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.rakihome.RekiAdapter
import devs.mulham.horizontalcalendar.HorizontalCalendar
import devs.mulham.horizontalcalendar.HorizontalCalendarView
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class viewallactivity : AppCompatActivity() {

    private lateinit var rekiAdapter: viewalladapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewallactivity)

        val backImage:TextView=findViewById(R.id.txtYourschedule)
        backImage.setOnClickListener {
            this.finish()
        }

        val recyclerView: RecyclerView =findViewById(R.id.recyclerview)

        // Initialize adapter with empty list
        rekiAdapter = viewalladapter(emptyList())

        // Set layout manager to your RecyclerView if needed
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set adapter to RecyclerView
        recyclerView.adapter = rekiAdapter



        val calender = findViewById<HorizontalCalendarView>(R.id.calendarView2)

        // Initialize horizontal calendar
        val startDate = Calendar.getInstance()
        startDate.add(Calendar.MONTH, -1)
        val endDate = Calendar.getInstance()
        endDate.add(Calendar.MONTH, 1)
        val horizontalCalendar: HorizontalCalendar =
            HorizontalCalendar.Builder(this, calender.id)
                .range(startDate, endDate)
                .datesNumberOnScreen(5)
                .build()

        // Format today's date in "dd/mm/yyyy" format
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val today = Calendar.getInstance()
        val formattedToday = dateFormat.format(today.time)

        // Parse the formatted string back to a Calendar object
        val selectedDate = Calendar.getInstance()
        selectedDate.time = dateFormat.parse(formattedToday)!!

        // Automatically select today's date
        horizontalCalendar.selectDate(selectedDate, true)


        horizontalCalendar.calendarListener = object : HorizontalCalendarListener() {
            override fun onDateSelected(date: Calendar, position: Int) {
                // Format selected date in "yyyy-MM-dd" format
                val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                val formattedSelectedDate = dateFormat.format(date.time)

                // Make an API call and handle the response
                //submitAttendanceHistory(formattedSelectedDate)
            }
        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }
}