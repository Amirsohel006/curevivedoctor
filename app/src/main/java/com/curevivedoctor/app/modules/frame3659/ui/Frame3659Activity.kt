package com.curevivedoctor.app.modules.frame3659.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityFrame3659Binding
import com.curevivedoctor.app.modules.frame3659.`data`.viewmodel.Frame3659VM
import kotlin.String
import kotlin.Unit

class Frame3659Activity : BaseActivity<ActivityFrame3659Binding>(R.layout.activity_frame_3659) {
  private val viewModel: Frame3659VM by viewModels<Frame3659VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame3659VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME3659ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame3659Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
