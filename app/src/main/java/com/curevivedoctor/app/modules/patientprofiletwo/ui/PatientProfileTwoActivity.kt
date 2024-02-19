package com.curevivedoctor.app.modules.patientprofiletwo.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityPatientProfileTwoBinding
import com.curevivedoctor.app.modules.patientprofiletwo.`data`.viewmodel.PatientProfileTwoVM
import com.curevivedoctor.app.modules.yogaprotocolthree.ui.YogaProtocolThreeActivity
import kotlin.String
import kotlin.Unit

class PatientProfileTwoActivity :
    BaseActivity<ActivityPatientProfileTwoBinding>(R.layout.activity_patient_profile_two) {
  private val viewModel: PatientProfileTwoVM by viewModels<PatientProfileTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.patientProfileTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSkip.setOnClickListener {
      val destIntent = YogaProtocolThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PATIENT_PROFILE_TWO_ACTIVITY"

  }
}
