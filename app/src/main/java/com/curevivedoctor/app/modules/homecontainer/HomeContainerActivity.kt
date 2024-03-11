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

        replaceFragemnt1(HomeFragment())
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
                    replaceFragment(SettingsFragment())
                }

                R.id.settings -> {
                    replaceFragment(ChatFragment())
                }
            }
            true

        }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.addToBackStack(fragment.javaClass.simpleName)
        fragmentTransaction.commit()

    }

    private fun replaceFragemnt1(fragment: Fragment) {
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


    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val fragmentManager=supportFragmentManager
        val fragments = supportFragmentManager.backStackEntryCount
        if (fragments == 1) {
            AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                    DialogInterface.OnClickListener { dialog, id -> finish() })
                .setNegativeButton("No", null)
                .show()
        }
        else {

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



            }
            else {
                super.onBackPressed()
            }
        }
        // }
    }
}