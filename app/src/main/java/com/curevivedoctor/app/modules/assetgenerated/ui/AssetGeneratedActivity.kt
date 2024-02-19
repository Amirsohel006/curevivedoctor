package com.curevivedoctor.app.modules.assetgenerated.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityAssetGeneratedBinding
import com.curevivedoctor.app.modules.assetgenerated.`data`.viewmodel.AssetGeneratedVM
import kotlin.String
import kotlin.Unit

class AssetGeneratedActivity :
    BaseActivity<ActivityAssetGeneratedBinding>(R.layout.activity_asset_generated) {
  private val viewModel: AssetGeneratedVM by viewModels<AssetGeneratedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.assetGeneratedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ASSET_GENERATED_ACTIVITY"

  }
}
