package com.curevivedoctor.app.modules.patientprofileone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientprofileone.`data`.model.ListmoRowModel
import com.curevivedoctor.app.modules.patientprofileone.`data`.model.PatientProfileOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PatientProfileOneVM : ViewModel(), KoinComponent {
  val patientProfileOneModel: MutableLiveData<PatientProfileOneModel> =
      MutableLiveData(PatientProfileOneModel())

  var navArguments: Bundle? = null

  val listmoList: MutableLiveData<MutableList<ListmoRowModel>> = MutableLiveData(mutableListOf())
}
