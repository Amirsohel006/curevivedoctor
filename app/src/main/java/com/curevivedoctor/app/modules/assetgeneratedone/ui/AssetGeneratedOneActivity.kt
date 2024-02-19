package com.curevivedoctor.app.modules.assetgeneratedone.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityAssetGeneratedOneBinding
import com.curevivedoctor.app.modules.assetgeneratedone.`data`.viewmodel.AssetGeneratedOneVM
import kotlin.String
import kotlin.Unit

class AssetGeneratedOneActivity :
    BaseActivity<ActivityAssetGeneratedOneBinding>(R.layout.activity_asset_generated_one) {
  private val viewModel: AssetGeneratedOneVM by viewModels<AssetGeneratedOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.assetGeneratedOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ASSET_GENERATED_ONE_ACTIVITY"

  }
}
