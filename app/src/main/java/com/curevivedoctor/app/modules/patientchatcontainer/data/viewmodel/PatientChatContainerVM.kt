package com.curevivedoctor.app.modules.patientchatcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientchatcontainer.`data`.model.PatientChatContainerModel
import org.koin.core.KoinComponent

class PatientChatContainerVM : ViewModel(), KoinComponent {
  val patientChatContainerModel: MutableLiveData<PatientChatContainerModel> =
      MutableLiveData(PatientChatContainerModel())

  var navArguments: Bundle? = null
}
