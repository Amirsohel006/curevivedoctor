package com.curevivedoctor.app.modules.frame3676.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.frame3676.`data`.model.Frame3676Model
import org.koin.core.KoinComponent

class Frame3676VM : ViewModel(), KoinComponent {
  val frame3676Model: MutableLiveData<Frame3676Model> = MutableLiveData(Frame3676Model())

  var navArguments: Bundle? = null
}
