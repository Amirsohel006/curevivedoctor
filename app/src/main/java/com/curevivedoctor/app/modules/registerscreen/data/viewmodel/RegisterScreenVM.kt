package com.curevivedoctor.app.modules.registerscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.registerscreen.`data`.model.ListlanguageSevenRowModel
import com.curevivedoctor.app.modules.registerscreen.`data`.model.RegisterScreenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RegisterScreenVM : ViewModel(), KoinComponent {
  val registerScreenModel: MutableLiveData<RegisterScreenModel> =
      MutableLiveData(RegisterScreenModel())

  var navArguments: Bundle? = null

  val listlanguageSevenList: MutableLiveData<MutableList<ListlanguageSevenRowModel>> =
      MutableLiveData(mutableListOf())
}
