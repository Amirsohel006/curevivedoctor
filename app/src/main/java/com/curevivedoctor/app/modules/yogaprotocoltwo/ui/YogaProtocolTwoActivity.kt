package com.curevivedoctor.app.modules.yogaprotocoltwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityYogaProtocolTwoBinding
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import com.curevivedoctor.app.modules.yogaprotocolthree.ui.YogaProtocolThreeActivity
import com.curevivedoctor.app.modules.yogaprotocoltwo.`data`.viewmodel.YogaProtocolTwoVM
import kotlin.String
import kotlin.Unit

class YogaProtocolTwoActivity :
    BaseActivity<ActivityYogaProtocolTwoBinding>(R.layout.activity_yoga_protocol_two) {
  private val viewModel: YogaProtocolTwoVM by viewModels<YogaProtocolTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.yogaProtocolTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSkip.setOnClickListener {
      val destIntent = YogaProtocolThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "YOGA_PROTOCOL_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YogaProtocolTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
