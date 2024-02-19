package com.curevivedoctor.app.modules.registerscreentwo.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityRegisterScreenTwoBinding
import com.curevivedoctor.app.modules.registerscreenone.ui.RegisterScreenOneActivity
import com.curevivedoctor.app.modules.registerscreentwo.`data`.viewmodel.RegisterScreenTwoVM
import com.curevivedoctor.app.modules.welcomescreensfive.ui.WelcomeScreensFiveActivity
import kotlin.String
import kotlin.Unit

class RegisterScreenTwoActivity :
    BaseActivity<ActivityRegisterScreenTwoBinding>(R.layout.activity_register_screen_two) {
  private val viewModel: RegisterScreenTwoVM by viewModels<RegisterScreenTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerScreenTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = RegisterScreenOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameArrowbackios.setOnClickListener {
      val destIntent = WelcomeScreensFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REGISTER_SCREEN_TWO_ACTIVITY"

  }
}
