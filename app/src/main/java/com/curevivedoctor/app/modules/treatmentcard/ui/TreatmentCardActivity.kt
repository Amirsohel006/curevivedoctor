package com.curevivedoctor.app.modules.treatmentcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityTreatmentCardBinding
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import com.curevivedoctor.app.modules.treatmentcard.`data`.viewmodel.TreatmentCardVM
import kotlin.String
import kotlin.Unit

class TreatmentCardActivity :
    BaseActivity<ActivityTreatmentCardBinding>(R.layout.activity_treatment_card) {
  private val viewModel: TreatmentCardVM by viewModels<TreatmentCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.treatmentCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TREATMENT_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TreatmentCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
