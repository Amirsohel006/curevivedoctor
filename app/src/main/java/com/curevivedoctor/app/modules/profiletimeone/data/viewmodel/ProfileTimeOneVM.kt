package com.curevivedoctor.app.modules.profiletimeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.profiletimeone.`data`.model.ListtimeTwo1RowModel
import com.curevivedoctor.app.modules.profiletimeone.`data`.model.ProfileTimeOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileTimeOneVM : ViewModel(), KoinComponent {
  val profileTimeOneModel: MutableLiveData<ProfileTimeOneModel> =
      MutableLiveData(ProfileTimeOneModel())

  var navArguments: Bundle? = null

  val listtimeTwoList: MutableLiveData<MutableList<ListtimeTwo1RowModel>> =
      MutableLiveData(mutableListOf())
}
