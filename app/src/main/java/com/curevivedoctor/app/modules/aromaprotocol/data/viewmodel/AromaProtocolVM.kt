package com.curevivedoctor.app.modules.aromaprotocol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.aromaprotocol.`data`.model.AromaProtocolModel
import org.koin.core.KoinComponent

class AromaProtocolVM : ViewModel(), KoinComponent {
  val aromaProtocolModel: MutableLiveData<AromaProtocolModel> =
      MutableLiveData(AromaProtocolModel())

  var navArguments: Bundle? = null
}
