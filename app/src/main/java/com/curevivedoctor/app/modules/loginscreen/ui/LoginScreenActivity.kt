package com.curevivedoctor.app.modules.loginscreen.ui

import android.content.Intent
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityLoginScreenBinding
import com.curevivedoctor.app.modules.homecontainer.HomeContainerActivity
import com.curevivedoctor.app.modules.loginscreen.`data`.viewmodel.LoginScreenVM
import kotlin.String
import kotlin.Unit

class LoginScreenActivity : BaseActivity<ActivityLoginScreenBinding>(R.layout.activity_login_screen)
    {
  private val viewModel: LoginScreenVM by viewModels<LoginScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = Intent(this,HomeContainerActivity::class.java)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_SCREEN_ACTIVITY"

  }
}
