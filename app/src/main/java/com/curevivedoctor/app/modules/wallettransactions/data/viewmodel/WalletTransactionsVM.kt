package com.curevivedoctor.app.modules.wallettransactions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.wallettransactions.`data`.model.Listgroup100000197RowModel
import com.curevivedoctor.app.modules.wallettransactions.`data`.model.WalletTransactionsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WalletTransactionsVM : ViewModel(), KoinComponent {
  val walletTransactionsModel: MutableLiveData<WalletTransactionsModel> =
      MutableLiveData(WalletTransactionsModel())

  var navArguments: Bundle? = null

  val listgroup100000197List: MutableLiveData<MutableList<Listgroup100000197RowModel>> =
      MutableLiveData(mutableListOf())
}
