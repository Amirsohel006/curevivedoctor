package com.curevivedoctor.app.modules.slots.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.slots.`data`.model.SlotsModel
import com.curevivedoctor.app.modules.slots.`data`.model.SlotsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SlotsVM : ViewModel(), KoinComponent {
  val slotsModel: MutableLiveData<SlotsModel> = MutableLiveData(SlotsModel())

  var navArguments: Bundle? = null

  val slotsList: MutableLiveData<MutableList<SlotsRowModel>> = MutableLiveData(mutableListOf())
}
