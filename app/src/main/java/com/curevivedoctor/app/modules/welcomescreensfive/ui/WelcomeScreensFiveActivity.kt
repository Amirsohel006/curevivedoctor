package com.curevivedoctor.app.modules.welcomescreensfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityWelcomeScreensFiveBinding
import com.curevivedoctor.app.modules.welcomescreensfive.`data`.viewmodel.WelcomeScreensFiveVM
import kotlin.String
import kotlin.Unit

class WelcomeScreensFiveActivity :
    BaseActivity<ActivityWelcomeScreensFiveBinding>(R.layout.activity_welcome_screens_five) {
  private val viewModel: WelcomeScreensFiveVM by viewModels<WelcomeScreensFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreensFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WELCOME_SCREENS_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomeScreensFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
