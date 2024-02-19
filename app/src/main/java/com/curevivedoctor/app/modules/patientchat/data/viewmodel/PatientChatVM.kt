package com.curevivedoctor.app.modules.patientchat.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientchat.`data`.model.PatientChatModel
import org.koin.core.KoinComponent

class PatientChatVM : ViewModel(), KoinComponent {
  val patientChatModel: MutableLiveData<PatientChatModel> = MutableLiveData(PatientChatModel())

  var navArguments: Bundle? = null
}
