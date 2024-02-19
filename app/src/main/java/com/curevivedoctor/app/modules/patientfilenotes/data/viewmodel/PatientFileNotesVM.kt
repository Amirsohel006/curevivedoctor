package com.curevivedoctor.app.modules.patientfilenotes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientfilenotes.`data`.model.PatientFileNotesModel
import org.koin.core.KoinComponent

class PatientFileNotesVM : ViewModel(), KoinComponent {
  val patientFileNotesModel: MutableLiveData<PatientFileNotesModel> =
      MutableLiveData(PatientFileNotesModel())

  var navArguments: Bundle? = null
}
