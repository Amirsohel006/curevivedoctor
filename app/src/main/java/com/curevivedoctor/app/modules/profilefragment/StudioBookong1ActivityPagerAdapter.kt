package com.curevivedoctor.app.modules.profilefragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class StudioBookong1ActivityPagerAdapter(
    private val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle,
    private val titlesWithIcons: List<Pair<Int, String>>
) : FragmentStateAdapter(fragmentManager, lifecycle) {


    override fun getItemCount(): Int = titlesWithIcons.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_info),MyApp.getInstance().resources.getString(R.string.lbl_price),MyApp.getInstance().resources.getString(R.string.lbl_time),MyApp.getInstance().resources.getString(R.string.lbl_code))

        val viewPages: List<Fragment> =
                listOf(InfoFragment(),PriceFragment(),InfoFragment(),CodeFragment())

    }
}
