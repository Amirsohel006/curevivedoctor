package com.curevivedoctor.app.modules.schedulelist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.schedulelist.`data`.model.ListsRowModel
import com.curevivedoctor.app.modules.schedulelist.`data`.model.ListtOneRowModel
import com.curevivedoctor.app.modules.schedulelist.`data`.model.ScheduleListModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScheduleListVM : ViewModel(), KoinComponent {
  val scheduleListModel: MutableLiveData<ScheduleListModel> = MutableLiveData(ScheduleListModel())

  var navArguments: Bundle? = null

  val listsList: MutableLiveData<MutableList<ListsRowModel>> = MutableLiveData(mutableListOf())

  val listtOneList: MutableLiveData<MutableList<ListtOneRowModel>> =
      MutableLiveData(mutableListOf())
}
