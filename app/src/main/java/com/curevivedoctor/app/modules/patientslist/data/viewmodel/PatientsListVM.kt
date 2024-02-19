package com.curevivedoctor.app.modules.patientslist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.patientslist.`data`.model.PatientsListModel
import com.curevivedoctor.app.modules.patientslist.`data`.model.PatientsListRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PatientsListVM : ViewModel(), KoinComponent {
  val patientsListModel: MutableLiveData<PatientsListModel> = MutableLiveData(PatientsListModel())

  var navArguments: Bundle? = null

  val patientsListList: MutableLiveData<MutableList<PatientsListRowModel>> =
      MutableLiveData(mutableListOf())
}
