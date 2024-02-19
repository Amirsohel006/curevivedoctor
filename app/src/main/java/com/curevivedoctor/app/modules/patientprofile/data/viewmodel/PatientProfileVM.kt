package com.curevivedoctor.app.modules.patientprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientprofile.`data`.model.Listmo1RowModel
import com.curevivedoctor.app.modules.patientprofile.`data`.model.PatientProfileModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PatientProfileVM : ViewModel(), KoinComponent {
  val patientProfileModel: MutableLiveData<PatientProfileModel> =
      MutableLiveData(PatientProfileModel())

  var navArguments: Bundle? = null

  val listmoList: MutableLiveData<MutableList<Listmo1RowModel>> = MutableLiveData(mutableListOf())
}
