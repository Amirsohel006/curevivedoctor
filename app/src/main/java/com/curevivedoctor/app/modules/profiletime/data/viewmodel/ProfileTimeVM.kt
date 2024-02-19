package com.curevivedoctor.app.modules.profiletime.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.profiletime.`data`.model.ListtimeTwoRowModel
import com.curevivedoctor.app.modules.profiletime.`data`.model.ProfileTimeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileTimeVM : ViewModel(), KoinComponent {
  val profileTimeModel: MutableLiveData<ProfileTimeModel> = MutableLiveData(ProfileTimeModel())

  var navArguments: Bundle? = null

  val listtimeTwoList: MutableLiveData<MutableList<ListtimeTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
