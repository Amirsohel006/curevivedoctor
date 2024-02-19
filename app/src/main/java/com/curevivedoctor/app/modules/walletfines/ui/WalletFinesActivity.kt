package com.curevivedoctor.app.modules.walletfines.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityWalletFinesBinding
import com.curevivedoctor.app.modules.wallet.ui.WalletActivity
import com.curevivedoctor.app.modules.walletfines.`data`.viewmodel.WalletFinesVM
import kotlin.String
import kotlin.Unit

class WalletFinesActivity : BaseActivity<ActivityWalletFinesBinding>(R.layout.activity_wallet_fines)
    {
  private val viewModel: WalletFinesVM by viewModels<WalletFinesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.walletFinesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = WalletActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WALLET_FINES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WalletFinesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
