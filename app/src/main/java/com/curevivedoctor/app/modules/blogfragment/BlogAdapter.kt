package com.curevivedoctor.app.modules.blogfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.curevivedoctor.app.modules.chatfragment.ChatFragment
import com.curevivedoctor.app.modules.homefragment.HomeFragment
import com.curevivedoctor.app.modules.profilefragment.InfoFragment
import com.curevivedoctor.app.modules.profilefragment.PriceFragment
import com.curevivedoctor.app.modules.profilefragment.StudioBookong1ActivityPagerAdapter

class BlogAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
            listOf("Posts","Recipes")

        val viewPages: List<Fragment> =
            listOf(PostFragment(),RecipesFragment())

    }
}