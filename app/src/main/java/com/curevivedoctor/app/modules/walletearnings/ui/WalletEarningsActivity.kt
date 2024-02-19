package com.curevivedoctor.app.modules.walletearnings.ui

import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityWalletEarningsBinding
import com.curevivedoctor.app.modules.wallet.ui.WalletActivity
import com.curevivedoctor.app.modules.walletearnings.`data`.model.ListreleasedamountRowModel
import com.curevivedoctor.app.modules.walletearnings.`data`.viewmodel.WalletEarningsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WalletEarningsActivity :
    BaseActivity<ActivityWalletEarningsBinding>(R.layout.activity_wallet_earnings) {
  private val viewModel: WalletEarningsVM by viewModels<WalletEarningsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listreleasedamountAdapter =
    ListreleasedamountAdapter(viewModel.listreleasedamountList.value?:mutableListOf())
    binding.recyclerListreleasedamount.adapter = listreleasedamountAdapter
    listreleasedamountAdapter.setOnItemClickListener(
    object : ListreleasedamountAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListreleasedamountRowModel) {
        onClickRecyclerListreleasedamount(view, position, item)
      }
    }
    )
    viewModel.listreleasedamountList.observe(this) {
      listreleasedamountAdapter.updateData(it)
    }
    binding.walletEarningsVM = viewModel
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

  fun onClickRecyclerListreleasedamount(
    view: View,
    position: Int,
    item: ListreleasedamountRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "WALLET_EARNINGS_ACTIVITY"

  }
}
