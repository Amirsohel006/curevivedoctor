package com.curevivedoctor.app.modules.frametwentynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.frametwentynine.`data`.model.FrameTwentynineModel
import org.koin.core.KoinComponent

class FrameTwentynineVM : ViewModel(), KoinComponent {
  val frameTwentynineModel: MutableLiveData<FrameTwentynineModel> =
      MutableLiveData(FrameTwentynineModel())

  var navArguments: Bundle? = null
}
