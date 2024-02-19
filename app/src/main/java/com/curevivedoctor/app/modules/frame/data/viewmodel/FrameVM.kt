package com.curevivedoctor.app.modules.frame.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.frame.`data`.model.FrameModel
import com.curevivedoctor.app.modules.frame.`data`.model.ListellipseEightRowModel
import com.curevivedoctor.app.modules.frame.`data`.model.ListrectangleFifteenRowModel
import com.curevivedoctor.app.modules.frame.`data`.model.ListrectangleThirteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FrameVM : ViewModel(), KoinComponent {
  val frameModel: MutableLiveData<FrameModel> = MutableLiveData(FrameModel())

  var navArguments: Bundle? = null

  val listrectangleThirteenList: MutableLiveData<MutableList<ListrectangleThirteenRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangleFifteenList: MutableLiveData<MutableList<ListrectangleFifteenRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipseEightList: MutableLiveData<MutableList<ListellipseEightRowModel>> =
      MutableLiveData(mutableListOf())
}
