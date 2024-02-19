package com.curevivedoctor.app.modules.workshops.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.workshops.`data`.model.Lists3RowModel
import com.curevivedoctor.app.modules.workshops.`data`.model.ListtOne3RowModel
import com.curevivedoctor.app.modules.workshops.`data`.model.ListwebinarRowModel
import com.curevivedoctor.app.modules.workshops.`data`.model.WorkshopsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WorkshopsVM : ViewModel(), KoinComponent {
  val workshopsModel: MutableLiveData<WorkshopsModel> = MutableLiveData(WorkshopsModel())

  var navArguments: Bundle? = null

  val listsList: MutableLiveData<MutableList<Lists3RowModel>> = MutableLiveData(mutableListOf())

  val listtOneList: MutableLiveData<MutableList<ListtOne3RowModel>> =
      MutableLiveData(mutableListOf())

  val listwebinarList: MutableLiveData<MutableList<ListwebinarRowModel>> =
      MutableLiveData(mutableListOf())
}
