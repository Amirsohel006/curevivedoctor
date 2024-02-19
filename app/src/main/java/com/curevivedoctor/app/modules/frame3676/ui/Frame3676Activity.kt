package com.curevivedoctor.app.modules.frame3676.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityFrame3676Binding
import com.curevivedoctor.app.modules.frame3676.`data`.viewmodel.Frame3676VM
import kotlin.String
import kotlin.Unit

class Frame3676Activity : BaseActivity<ActivityFrame3676Binding>(R.layout.activity_frame_3676) {
  private val viewModel: Frame3676VM by viewModels<Frame3676VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame3676VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME3676ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame3676Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
