package com.curevivedoctor.app.modules.accupressureprotocol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.AccupressureProtocolModel
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointRowModel
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointSixRowModel
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccupressureProtocolVM : ViewModel(), KoinComponent {
  val accupressureProtocolModel: MutableLiveData<AccupressureProtocolModel> =
      MutableLiveData(AccupressureProtocolModel())

  var navArguments: Bundle? = null

  val listenterpointList: MutableLiveData<MutableList<ListenterpointRowModel>> =
      MutableLiveData(mutableListOf())

  val listenterpointThreeList: MutableLiveData<MutableList<ListenterpointThreeRowModel>> =
      MutableLiveData(mutableListOf())

  val listenterpointSixList: MutableLiveData<MutableList<ListenterpointSixRowModel>> =
      MutableLiveData(mutableListOf())
}
