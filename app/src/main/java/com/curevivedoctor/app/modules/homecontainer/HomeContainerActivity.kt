package com.curevivedoctor.app.modules.homecontainer

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.WalletFragment
import com.curevivedoctor.app.modules.blogfragment.Blog
import com.curevivedoctor.app.modules.chatfragment.ChatFragment
import com.curevivedoctor.app.modules.homefragment.HomeFragment
import com.curevivedoctor.app.modules.profilefragment.Profile_Fragment
import com.curevivedoctor.app.modules.settingFragment.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeContainerActivity : AppCompatActivity() {


    private lateinit var frameBottombar:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_container)

        frameBottombar=findViewById(R.id.frameBottombar)

        replaceFragment(HomeFragment())
        frameBottombar.setOnItemSelectedListener {

            when(it.itemId ){
                R.id.home -> {
                    replaceFragment(HomeFragment())
                }


                R.id.wallet ->{
                    replaceFragment(WalletFragment())
                }

                R.id.profile ->{
                    replaceFragment(Profile_Fragment())
                }

                R.id.setting -> {
                    replaceFragment(Blog())
                }

                R.id.settings -> {
                    replaceFragment(ChatFragment())
                }
            }
            true

        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // Check if the fragment is already in the back stack
        val existingFragment = fragmentManager.findFragmentByTag(fragment.javaClass.simpleName)

        if (existingFragment == null) {
            fragmentTransaction.replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName)
            fragmentTransaction.addToBackStack(fragment.javaClass.simpleName)
            fragmentTransaction.commit()
        } else {
            // If the fragment already exists, simply pop the back stack up to it
            fragmentManager.popBackStackImmediate(existingFragment.javaClass.simpleName, 0)
        }
    }


    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager

        if (fragmentManager.backStackEntryCount == 1) {
            showExitDialog()
        } else {
            if (fragmentManager.backStackEntryCount > 1) {
                fragmentManager.popBackStackImmediate(
                    fragmentManager.getBackStackEntryAt(1).id,
                    FragmentManager.POP_BACK_STACK_INCLUSIVE
                )

                var selectedFragment: Fragment? = null
                val fragments = supportFragmentManager.fragments
                for (fragment in fragments) {
                    if (fragment != null && fragment.isVisible) {
                        selectedFragment = fragment
                        break
                    }
                }

                selectedFragment?.let {
                    when (it) {
                        is HomeFragment -> frameBottombar.selectedItemId = R.id.home
                        is WalletFragment -> frameBottombar.selectedItemId = R.id.wallet
                        is Profile_Fragment -> frameBottombar.selectedItemId = R.id.profile
                        is SettingsFragment -> frameBottombar.selectedItemId = R.id.setting
                        is ChatFragment  -> frameBottombar.selectedItemId= R.id.settings
                    }
                } ?: super.onBackPressed()
            } else {
                super.onBackPressed()
            }
        }
    }


    private fun showExitDialog() {
        AlertDialog.Builder(this)
            .setMessage("Are you sure you want to exit?")
            .setCancelable(false)
            .setPositiveButton("Yes", DialogInterface.OnClickListener { _, _ -> finish() })
            .setNegativeButton("No", null)
            .show()
    }



}