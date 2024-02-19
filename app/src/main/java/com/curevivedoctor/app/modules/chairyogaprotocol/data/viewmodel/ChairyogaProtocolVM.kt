package com.curevivedoctor.app.modules.chairyogaprotocol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.chairyogaprotocol.`data`.model.ChairyogaProtocolModel
import org.koin.core.KoinComponent

class ChairyogaProtocolVM : ViewModel(), KoinComponent {
  val chairyogaProtocolModel: MutableLiveData<ChairyogaProtocolModel> =
      MutableLiveData(ChairyogaProtocolModel())

  var navArguments: Bundle? = null
}
