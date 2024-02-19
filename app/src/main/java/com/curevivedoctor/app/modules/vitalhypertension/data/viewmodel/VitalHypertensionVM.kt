package com.curevivedoctor.app.modules.vitalhypertension.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.Listellipse544RowModel
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.Lists1RowModel
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.ListtOne1RowModel
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.VitalHypertensionModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VitalHypertensionVM : ViewModel(), KoinComponent {
  val vitalHypertensionModel: MutableLiveData<VitalHypertensionModel> =
      MutableLiveData(VitalHypertensionModel())

  var navArguments: Bundle? = null

  val listsList: MutableLiveData<MutableList<Lists1RowModel>> = MutableLiveData(mutableListOf())

  val listtOneList: MutableLiveData<MutableList<ListtOne1RowModel>> =
      MutableLiveData(mutableListOf())

  val listellipse544List: MutableLiveData<MutableList<Listellipse544RowModel>> =
      MutableLiveData(mutableListOf())
}
