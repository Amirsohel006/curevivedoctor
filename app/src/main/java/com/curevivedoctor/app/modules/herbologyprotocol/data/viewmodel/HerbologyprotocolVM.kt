package com.curevivedoctor.app.modules.herbologyprotocol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.herbologyprotocol.`data`.model.HerbologyprotocolModel
import org.koin.core.KoinComponent

class HerbologyprotocolVM : ViewModel(), KoinComponent {
  val herbologyprotocolModel: MutableLiveData<HerbologyprotocolModel> =
      MutableLiveData(HerbologyprotocolModel())

  var navArguments: Bundle? = null
}
