package com.curevivedoctor.app.modules.dietprotocol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.DietProtocolModel
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.Listellipse399OneRowModel
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.Listellipse399TwoRowModel
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.ListentermealRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DietProtocolVM : ViewModel(), KoinComponent {
  val dietProtocolModel: MutableLiveData<DietProtocolModel> = MutableLiveData(DietProtocolModel())

  var navArguments: Bundle? = null

  val listentermealList: MutableLiveData<MutableList<ListentermealRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipse399OneList: MutableLiveData<MutableList<Listellipse399OneRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipse399TwoList: MutableLiveData<MutableList<Listellipse399TwoRowModel>> =
      MutableLiveData(mutableListOf())
}
