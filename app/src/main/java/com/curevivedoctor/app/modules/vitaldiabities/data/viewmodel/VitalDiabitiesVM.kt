package com.curevivedoctor.app.modules.vitaldiabities.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.Listellipse545RowModel
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.Lists2RowModel
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.ListtOne2RowModel
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.VitalDiabitiesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VitalDiabitiesVM : ViewModel(), KoinComponent {
  val vitalDiabitiesModel: MutableLiveData<VitalDiabitiesModel> =
      MutableLiveData(VitalDiabitiesModel())

  var navArguments: Bundle? = null

  val listsList: MutableLiveData<MutableList<Lists2RowModel>> = MutableLiveData(mutableListOf())

  val listtOneList: MutableLiveData<MutableList<ListtOne2RowModel>> =
      MutableLiveData(mutableListOf())

  val listellipse544List: MutableLiveData<MutableList<Listellipse545RowModel>> =
      MutableLiveData(mutableListOf())
}
