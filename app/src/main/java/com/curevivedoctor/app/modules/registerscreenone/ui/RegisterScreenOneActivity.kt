package com.curevivedoctor.app.modules.registerscreenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityRegisterScreenOneBinding
import com.curevivedoctor.app.modules.registerscreen.ui.RegisterScreenActivity
import com.curevivedoctor.app.modules.registerscreenone.`data`.viewmodel.RegisterScreenOneVM
import com.curevivedoctor.app.modules.welcomescreensfive.ui.WelcomeScreensFiveActivity
import kotlin.String
import kotlin.Unit

class RegisterScreenOneActivity :
    BaseActivity<ActivityRegisterScreenOneBinding>(R.layout.activity_register_screen_one) {
  private val viewModel: RegisterScreenOneVM by viewModels<RegisterScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerScreenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameArrowbackios.setOnClickListener {
      val destIntent = WelcomeScreensFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnComplete.setOnClickListener {
      val destIntent = RegisterScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_SCREEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterScreenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
