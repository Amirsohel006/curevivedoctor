package com.curevivedoctor.app.modules.rakihome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import devs.mulham.horizontalcalendar.HorizontalCalendar
import devs.mulham.horizontalcalendar.HorizontalCalendarView
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class RekiHomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    private lateinit var rekiAdapter: RekiAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reki_home, container, false).apply {
            val recyclerView:RecyclerView=findViewById(R.id.recyclerview)


            val calender = findViewById<HorizontalCalendarView>(R.id.calendarView1)

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
            // Initialize adapter with empty list
            rekiAdapter = RekiAdapter(emptyList())

            // Set layout manager to your RecyclerView if needed
            recyclerView.layoutManager = LinearLayoutManager(requireContext())

            // Set adapter to RecyclerView
            recyclerView.adapter = rekiAdapter


        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RekiHomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RekiHomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}