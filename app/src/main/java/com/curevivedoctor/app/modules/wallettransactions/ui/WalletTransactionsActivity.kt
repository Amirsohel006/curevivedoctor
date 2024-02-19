package com.curevivedoctor.app.modules.wallettransactions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityWalletTransactionsBinding
import com.curevivedoctor.app.modules.wallet.ui.WalletActivity
import com.curevivedoctor.app.modules.walletfines.ui.WalletFinesActivity
import com.curevivedoctor.app.modules.wallettransactions.`data`.model.Listgroup100000197RowModel
import com.curevivedoctor.app.modules.wallettransactions.`data`.viewmodel.WalletTransactionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WalletTransactionsActivity :
    BaseActivity<ActivityWalletTransactionsBinding>(R.layout.activity_wallet_transactions) {
  private val viewModel: WalletTransactionsVM by viewModels<WalletTransactionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroup100000197Adapter =
    Listgroup100000197Adapter(viewModel.listgroup100000197List.value?:mutableListOf())
    binding.recyclerListgroup100000197.adapter = listgroup100000197Adapter
    listgroup100000197Adapter.setOnItemClickListener(
    object : Listgroup100000197Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listgroup100000197RowModel) {
        onClickRecyclerListgroup100000197(view, position, item)
      }
    }
    )
    viewModel.listgroup100000197List.observe(this) {
      listgroup100000197Adapter.updateData(it)
    }
    binding.walletTransactionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsearch.setOnClickListener {
      val destIntent = WalletFinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = WalletActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListgroup100000197(
    view: View,
    position: Int,
    item: Listgroup100000197RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "WALLET_TRANSACTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WalletTransactionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
