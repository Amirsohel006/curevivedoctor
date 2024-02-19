package com.curevivedoctor.app.modules.yogaprotocoltwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.yogaprotocoltwo.`data`.model.YogaProtocolTwoModel
import org.koin.core.KoinComponent

class YogaProtocolTwoVM : ViewModel(), KoinComponent {
  val yogaProtocolTwoModel: MutableLiveData<YogaProtocolTwoModel> =
      MutableLiveData(YogaProtocolTwoModel())

  var navArguments: Bundle? = null
}
