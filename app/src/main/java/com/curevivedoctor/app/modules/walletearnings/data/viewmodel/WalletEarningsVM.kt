package com.curevivedoctor.app.modules.walletearnings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.walletearnings.`data`.model.ListreleasedamountRowModel
import com.curevivedoctor.app.modules.walletearnings.`data`.model.WalletEarningsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WalletEarningsVM : ViewModel(), KoinComponent {
  val walletEarningsModel: MutableLiveData<WalletEarningsModel> =
      MutableLiveData(WalletEarningsModel())

  var navArguments: Bundle? = null

  val listreleasedamountList: MutableLiveData<MutableList<ListreleasedamountRowModel>> =
      MutableLiveData(mutableListOf())
}
