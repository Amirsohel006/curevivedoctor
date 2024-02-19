package com.curevivedoctor.app.modules.walletfines.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.walletfines.`data`.model.WalletFinesModel
import org.koin.core.KoinComponent

class WalletFinesVM : ViewModel(), KoinComponent {
  val walletFinesModel: MutableLiveData<WalletFinesModel> = MutableLiveData(WalletFinesModel())

  var navArguments: Bundle? = null
}
