package com.curevivedoctor.app.modules.hydrotherapyprotocol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityHydrotherapyprotocolBinding
import com.curevivedoctor.app.modules.hydrotherapyprotocol.`data`.viewmodel.HydrotherapyprotocolVM
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import kotlin.String
import kotlin.Unit

class HydrotherapyprotocolActivity :
    BaseActivity<ActivityHydrotherapyprotocolBinding>(R.layout.activity_hydrotherapyprotocol) {
  private val viewModel: HydrotherapyprotocolVM by viewModels<HydrotherapyprotocolVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hydrotherapyprotocolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HYDROTHERAPYPROTOCOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HydrotherapyprotocolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
