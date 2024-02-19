package com.curevivedoctor.app.modules.herbologyprotocol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityHerbologyprotocolBinding
import com.curevivedoctor.app.modules.herbologyprotocol.`data`.viewmodel.HerbologyprotocolVM
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import kotlin.String
import kotlin.Unit

class HerbologyprotocolActivity :
    BaseActivity<ActivityHerbologyprotocolBinding>(R.layout.activity_herbologyprotocol) {
  private val viewModel: HerbologyprotocolVM by viewModels<HerbologyprotocolVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.herbologyprotocolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HERBOLOGYPROTOCOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HerbologyprotocolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
