package com.curevivedoctor.app.modules.profilecodelink.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityProfileCodeLinkBinding
import com.curevivedoctor.app.modules.profilebarcode.ui.ProfileBarCodeActivity
import com.curevivedoctor.app.modules.profilecodelink.`data`.viewmodel.ProfileCodeLinkVM
import com.curevivedoctor.app.modules.profileinfo.ui.ProfileInfoActivity
import com.curevivedoctor.app.modules.profileprice.ui.ProfilePriceActivity
import com.curevivedoctor.app.modules.profiletime.ui.ProfileTimeActivity
import kotlin.String
import kotlin.Unit

class ProfileCodeLinkActivity :
    BaseActivity<ActivityProfileCodeLinkBinding>(R.layout.activity_profile_code_link) {
  private val viewModel: ProfileCodeLinkVM by viewModels<ProfileCodeLinkVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileCodeLinkVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtMyCode.setOnClickListener {
      val destIntent = ProfileBarCodeActivity.getIntent(this, null)
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
    binding.linearColumnmobile.setOnClickListener {
      val destIntent = ProfileInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_CODE_LINK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileCodeLinkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
