package com.curevivedoctor.app.modules.registerscreentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.registerscreentwo.`data`.model.RegisterScreenTwoModel
import org.koin.core.KoinComponent

class RegisterScreenTwoVM : ViewModel(), KoinComponent {
  val registerScreenTwoModel: MutableLiveData<RegisterScreenTwoModel> =
      MutableLiveData(RegisterScreenTwoModel())

  var navArguments: Bundle? = null
}
