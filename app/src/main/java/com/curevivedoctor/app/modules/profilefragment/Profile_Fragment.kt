package com.curevivedoctor.app.modules.profilefragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import com.curevivedoctor.app.modules.profileinfo.ui.ProfileInfoActivity
import com.curevivedoctor.app.modules.settings.ui.SettingsActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Profile_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Profile_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var settingImageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    val iconsAndTitles: List<Pair<Int, String>> = listOf(
        Pair(R.drawable.img_user_white_a700, MyApp.getInstance().resources.getString(R.string.lbl_info)),
        Pair(R.drawable.img_sort, MyApp.getInstance().resources.getString(R.string.lbl_price)),
        Pair(R.drawable.img_clock, MyApp.getInstance().resources.getString(R.string.lbl_time)),
        Pair(R.drawable.img_search_white_a700, MyApp.getInstance().resources.getString(R.string.lbl_code))
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_, container, false).apply {
            settingImageView=findViewById(R.id.settings)
            settingImageView.setOnClickListener {
                val i=Intent(requireActivity(),SettingsActivity::class.java)
                startActivity(i)
            }

            val viewPagerViewpager:ViewPager2=findViewById(R.id.viewPagerViewpager)

            val tabLayoutGroup2:TabLayout=findViewById(R.id.tabLayoutGroup2)

            val adapter = fragmentManager?.let { StudioBookong1ActivityPagerAdapter(it, lifecycle,iconsAndTitles) }
            viewPagerViewpager.adapter = adapter

            // Initialize the TabLayoutMediator without attaching it immediately
            val tabLayoutMediator = TabLayoutMediator(tabLayoutGroup2, viewPagerViewpager) { tab, position ->
                val tabText = StudioBookong1ActivityPagerAdapter.title[position]
                tab.text = tabText
//
//      val customTabDrawable = ContextCompat.getDrawable(this, R.drawable.selector_bg_white_a700_radius_10)
//      tab.view.background = customTabDrawable
            }

            // Attach the TabLayoutMediator after setting up the tabs
            tabLayoutMediator.attach()

            // Set up the OnTabSelectedListener for each tab individually
            for (position in 0 until adapter!!.itemCount) {
                val tab = tabLayoutGroup2.getTabAt(position)
                tab?.let {

                    val tabPaddingStart = resources.getDimensionPixelSize(R.dimen.custom_tab_padding_start)
                    val tabPaddingEnd = resources.getDimensionPixelSize(R.dimen.custom_tab_padding_end)
                    val tabPaddingTop = 0 // Adjust the top padding as needed
                    val tabPaddingBottom = 0 // Adjust the bottom padding as needed

                    // Set padding for the tab's view
                    val tabView = it.view
                    tabView.setPadding(tabPaddingStart, tabPaddingTop, tabPaddingEnd, tabPaddingBottom)

                    it.view.setOnClickListener {
                        // Fetch data for the selected tab
                        //  fetchStudio(StudioBookong1ActivityPagerAdapter.title[position])
                    }
                }
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Profile_Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Profile_Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}