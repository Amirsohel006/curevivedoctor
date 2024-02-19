package com.curevivedoctor.app.modules.frametwentynine.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityFrameTwentynineBinding
import com.curevivedoctor.app.modules.frametwentynine.`data`.viewmodel.FrameTwentynineVM
import kotlin.String
import kotlin.Unit

class FrameTwentynineActivity :
    BaseActivity<ActivityFrameTwentynineBinding>(R.layout.activity_frame_twentynine) {
  private val viewModel: FrameTwentynineVM by viewModels<FrameTwentynineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameTwentynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_TWENTYNINE_ACTIVITY"

  }
}
