package com.curevivedoctor.app.modules.profilebarcode.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityProfileBarCodeBinding
import com.curevivedoctor.app.modules.profilebarcode.`data`.viewmodel.ProfileBarCodeVM
import com.curevivedoctor.app.modules.profilecodelink.ui.ProfileCodeLinkActivity
import com.curevivedoctor.app.modules.profileinfo.ui.ProfileInfoActivity
import com.curevivedoctor.app.modules.profileprice.ui.ProfilePriceActivity
import com.curevivedoctor.app.modules.profiletime.ui.ProfileTimeActivity
import kotlin.String
import kotlin.Unit

class ProfileBarCodeActivity :
    BaseActivity<ActivityProfileBarCodeBinding>(R.layout.activity_profile_bar_code) {
  private val viewModel: ProfileBarCodeVM by viewModels<ProfileBarCodeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileBarCodeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnmobile.setOnClickListener {
      val destIntent = ProfileInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtMyLink.setOnClickListener {
      val destIntent = ProfileCodeLinkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnclock.setOnClickListener {
      val destIntent = ProfileTimeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnsort.setOnClickListener {
      val destIntent = ProfilePriceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_BAR_CODE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileBarCodeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
