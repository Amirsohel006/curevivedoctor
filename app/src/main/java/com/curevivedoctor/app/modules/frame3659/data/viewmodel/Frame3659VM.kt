package com.curevivedoctor.app.modules.frame3659.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.frame3659.`data`.model.Frame3659Model
import org.koin.core.KoinComponent

class Frame3659VM : ViewModel(), KoinComponent {
  val frame3659Model: MutableLiveData<Frame3659Model> = MutableLiveData(Frame3659Model())

  var navArguments: Bundle? = null
}
