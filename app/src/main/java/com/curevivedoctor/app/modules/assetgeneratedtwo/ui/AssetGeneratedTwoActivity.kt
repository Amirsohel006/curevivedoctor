package com.curevivedoctor.app.modules.assetgeneratedtwo.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityAssetGeneratedTwoBinding
import com.curevivedoctor.app.modules.assetgeneratedtwo.`data`.viewmodel.AssetGeneratedTwoVM
import kotlin.String
import kotlin.Unit

class AssetGeneratedTwoActivity :
    BaseActivity<ActivityAssetGeneratedTwoBinding>(R.layout.activity_asset_generated_two) {
  private val viewModel: AssetGeneratedTwoVM by viewModels<AssetGeneratedTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.assetGeneratedTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ASSET_GENERATED_TWO_ACTIVITY"

  }
}
