package com.curevivedoctor.app.modules.aromaprotocol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityAromaProtocolBinding
import com.curevivedoctor.app.modules.aromaprotocol.`data`.viewmodel.AromaProtocolVM
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import kotlin.String
import kotlin.Unit

class AromaProtocolActivity :
    BaseActivity<ActivityAromaProtocolBinding>(R.layout.activity_aroma_protocol) {
  private val viewModel: AromaProtocolVM by viewModels<AromaProtocolVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aromaProtocolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AROMA_PROTOCOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AromaProtocolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
