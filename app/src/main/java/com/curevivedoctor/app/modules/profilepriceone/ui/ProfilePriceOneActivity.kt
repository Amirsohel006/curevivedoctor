package com.curevivedoctor.app.modules.profilepriceone.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityProfilePriceOneBinding
import com.curevivedoctor.app.modules.profilebarcode.ui.ProfileBarCodeActivity
import com.curevivedoctor.app.modules.profileinfo.ui.ProfileInfoActivity
import com.curevivedoctor.app.modules.profilepriceone.`data`.viewmodel.ProfilePriceOneVM
import com.curevivedoctor.app.modules.profiletime.ui.ProfileTimeActivity
import kotlin.String
import kotlin.Unit

class ProfilePriceOneActivity :
    BaseActivity<ActivityProfilePriceOneBinding>(R.layout.activity_profile_price_one) {
  private val viewModel: ProfilePriceOneVM by viewModels<ProfilePriceOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profilePriceOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnmobile.setOnClickListener {
      val destIntent = ProfileInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAction.setOnClickListener {
      val destIntent = ProfileTimeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAction1.setOnClickListener {
      val destIntent = ProfileBarCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_PRICE_ONE_ACTIVITY"

  }
}
