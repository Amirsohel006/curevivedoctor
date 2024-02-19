package com.curevivedoctor.app.modules.wallet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityWalletBinding
import com.curevivedoctor.app.modules.wallet.`data`.viewmodel.WalletVM
import com.curevivedoctor.app.modules.wallettransactions.ui.WalletTransactionsActivity
import kotlin.String
import kotlin.Unit

class WalletActivity : BaseActivity<ActivityWalletBinding>(R.layout.activity_wallet) {
  private val viewModel: WalletVM by viewModels<WalletVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.walletVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowprice.setOnClickListener {
      val destIntent = WalletTransactionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WALLET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WalletActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
