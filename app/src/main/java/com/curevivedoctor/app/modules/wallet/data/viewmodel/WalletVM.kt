package com.curevivedoctor.app.modules.wallet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.wallet.`data`.model.WalletModel
import org.koin.core.KoinComponent

class WalletVM : ViewModel(), KoinComponent {
  val walletModel: MutableLiveData<WalletModel> = MutableLiveData(WalletModel())

  var navArguments: Bundle? = null
}
