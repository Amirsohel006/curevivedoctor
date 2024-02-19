package com.curevivedoctor.app.modules.tips.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityTipsBinding
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import com.curevivedoctor.app.modules.tips.`data`.viewmodel.TipsVM
import kotlin.String
import kotlin.Unit

class TipsActivity : BaseActivity<ActivityTipsBinding>(R.layout.activity_tips) {
  private val viewModel: TipsVM by viewModels<TipsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tipsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TIPS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TipsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
