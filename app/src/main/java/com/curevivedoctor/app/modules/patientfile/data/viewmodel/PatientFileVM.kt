package com.curevivedoctor.app.modules.patientfile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientfile.`data`.model.PatientFileModel
import org.koin.core.KoinComponent

class PatientFileVM : ViewModel(), KoinComponent {
  val patientFileModel: MutableLiveData<PatientFileModel> = MutableLiveData(PatientFileModel())

  var navArguments: Bundle? = null
}
