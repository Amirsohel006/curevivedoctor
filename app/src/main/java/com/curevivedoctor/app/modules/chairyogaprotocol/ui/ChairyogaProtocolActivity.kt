package com.curevivedoctor.app.modules.chairyogaprotocol.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityChairyogaProtocolBinding
import com.curevivedoctor.app.modules.chairyogaprotocol.`data`.viewmodel.ChairyogaProtocolVM
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import kotlin.String
import kotlin.Unit

class ChairyogaProtocolActivity :
    BaseActivity<ActivityChairyogaProtocolBinding>(R.layout.activity_chairyoga_protocol) {
  private val viewModel: ChairyogaProtocolVM by viewModels<ChairyogaProtocolVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chairyogaProtocolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHAIRYOGA_PROTOCOL_ACTIVITY"

  }
}
