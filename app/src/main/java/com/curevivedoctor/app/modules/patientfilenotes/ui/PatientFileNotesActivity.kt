package com.curevivedoctor.app.modules.patientfilenotes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityPatientFileNotesBinding
import com.curevivedoctor.app.modules.patientfile.ui.PatientFileActivity
import com.curevivedoctor.app.modules.patientfilenotes.`data`.viewmodel.PatientFileNotesVM
import com.curevivedoctor.app.modules.registerscreen.ui.RegisterScreenActivity
import kotlin.String
import kotlin.Unit

class PatientFileNotesActivity :
    BaseActivity<ActivityPatientFileNotesBinding>(R.layout.activity_patient_file_notes) {
  private val viewModel: PatientFileNotesVM by viewModels<PatientFileNotesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.patientFileNotesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtFile.setOnClickListener {
      val destIntent = PatientFileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = RegisterScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PATIENT_FILE_NOTES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PatientFileNotesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
