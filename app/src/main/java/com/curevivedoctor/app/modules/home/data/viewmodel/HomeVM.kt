package com.curevivedoctor.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.home.`data`.model.HomeModel
import com.curevivedoctor.app.modules.home.`data`.model.Listellipse543RowModel
import com.curevivedoctor.app.modules.home.`data`.model.ListmarkspenceRowModel
import com.curevivedoctor.app.modules.home.`data`.model.ListpatientsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val listmarkspenceList: MutableLiveData<MutableList<ListmarkspenceRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipse543List: MutableLiveData<MutableList<Listellipse543RowModel>> =
      MutableLiveData(mutableListOf())

  val listpatientsList: MutableLiveData<MutableList<ListpatientsRowModel>> =
      MutableLiveData(mutableListOf())
}
