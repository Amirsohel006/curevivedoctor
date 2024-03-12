package com.curevivedoctor.app.modules.containerforsupervisor

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.SettingsFragmentForSupervisor.SettingFragmentForSupervisor
import com.curevivedoctor.app.modules.chatforsupervisor.ChatForSuperVisor
import com.curevivedoctor.app.modules.rakihome.RekiHomeFragment
import com.curevivedoctor.app.modules.settingfragmentForReki.SettingFragmentForReki
import com.curevivedoctor.app.modules.supervisorHomeFragment.SuperVisorHomeFragmen
import com.curevivedoctor.app.modules.walletfragmentforeki.WalletFragmentForReki
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeContainerForSupervisor : AppCompatActivity() {

    private lateinit var frameBottombar: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_container_for_supervisor)
        frameBottombar=findViewById(R.id.frameBottombar)

        replaceFragemnt1(SuperVisorHomeFragmen())
        frameBottombar.setOnItemSelectedListener {

            when(it.itemId ){
                R.id.home -> {
                    replaceFragment(SuperVisorHomeFragmen())
                }


                R.id.settings ->{
                    replaceFragment(ChatForSuperVisor())
                }



                R.id.setting -> {
                    replaceFragment(SettingFragmentForSupervisor())
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