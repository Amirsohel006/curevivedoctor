package com.curevivedoctor.app.modules.hydrotherapyprotocol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.hydrotherapyprotocol.`data`.model.HydrotherapyprotocolModel
import org.koin.core.KoinComponent

class HydrotherapyprotocolVM : ViewModel(), KoinComponent {
  val hydrotherapyprotocolModel: MutableLiveData<HydrotherapyprotocolModel> =
      MutableLiveData(HydrotherapyprotocolModel())

  var navArguments: Bundle? = null
}
