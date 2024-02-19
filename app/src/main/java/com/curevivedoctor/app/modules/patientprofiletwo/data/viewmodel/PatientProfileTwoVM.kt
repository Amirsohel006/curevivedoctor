package com.curevivedoctor.app.modules.patientprofiletwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientprofiletwo.`data`.model.PatientProfileTwoModel
import org.koin.core.KoinComponent

class PatientProfileTwoVM : ViewModel(), KoinComponent {
  val patientProfileTwoModel: MutableLiveData<PatientProfileTwoModel> =
      MutableLiveData(PatientProfileTwoModel())

  var navArguments: Bundle? = null
}
