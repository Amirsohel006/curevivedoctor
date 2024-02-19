package com.curevivedoctor.app.modules.welcomescreensfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.welcomescreensfive.`data`.model.WelcomeScreensFiveModel
import org.koin.core.KoinComponent

class WelcomeScreensFiveVM : ViewModel(), KoinComponent {
  val welcomeScreensFiveModel: MutableLiveData<WelcomeScreensFiveModel> =
      MutableLiveData(WelcomeScreensFiveModel())

  var navArguments: Bundle? = null
}
