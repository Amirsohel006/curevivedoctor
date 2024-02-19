package com.curevivedoctor.app.modules.tips.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.tips.`data`.model.TipsModel
import org.koin.core.KoinComponent

class TipsVM : ViewModel(), KoinComponent {
  val tipsModel: MutableLiveData<TipsModel> = MutableLiveData(TipsModel())

  var navArguments: Bundle? = null
}
