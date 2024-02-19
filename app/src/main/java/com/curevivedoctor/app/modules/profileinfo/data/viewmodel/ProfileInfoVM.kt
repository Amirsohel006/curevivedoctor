package com.curevivedoctor.app.modules.profileinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.profileinfo.`data`.model.ListlanguageEightRowModel
import com.curevivedoctor.app.modules.profileinfo.`data`.model.ProfileInfoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileInfoVM : ViewModel(), KoinComponent {
  val profileInfoModel: MutableLiveData<ProfileInfoModel> = MutableLiveData(ProfileInfoModel())

  var navArguments: Bundle? = null

  val listlanguageEightList: MutableLiveData<MutableList<ListlanguageEightRowModel>> =
      MutableLiveData(mutableListOf())
}
