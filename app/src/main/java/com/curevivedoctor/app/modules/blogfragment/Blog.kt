package com.curevivedoctor.app.modules.blogfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.profilefragment.StudioBookong1ActivityPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Blog.newInstance] factory method to
 * create an instance of this fragment.
 */
class Blog : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        return inflater.inflate(R.layout.fragment_blog, container, false).apply {

            val adapter = BlogAdapter(childFragmentManager, lifecycle)

            val viewPagerViewpager:ViewPager2=findViewById(R.id.viewPagerViewpager)
            viewPagerViewpager.adapter = adapter


            val tabLayoutGroup2:TabLayout=findViewById(R.id.tabLayoutGroup2)

            val tabLayoutMediator = TabLayoutMediator(tabLayoutGroup2, viewPagerViewpager) { tab, position ->
                val tabText = BlogAdapter.title[position]
                tab.text = tabText
            }


            tabLayoutMediator.attach()

            // Set up the OnTabSelectedListener for each tab individually
            for (position in 0 until adapter.itemCount) {
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
         * @return A new instance of fragment Blog.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Blog().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}