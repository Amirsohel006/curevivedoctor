package com.curevivedoctor.app.modules.patientfile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityPatientFileBinding
import com.curevivedoctor.app.modules.patientfile.`data`.viewmodel.PatientFileVM
import com.curevivedoctor.app.modules.patientfilenotes.ui.PatientFileNotesActivity
import kotlin.String
import kotlin.Unit

class PatientFileActivity : BaseActivity<ActivityPatientFileBinding>(R.layout.activity_patient_file)
    {
  private val viewModel: PatientFileVM by viewModels<PatientFileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.patientFileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtDoctorsnotes.setOnClickListener {
      val destIntent = PatientFileNotesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PATIENT_FILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PatientFileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
