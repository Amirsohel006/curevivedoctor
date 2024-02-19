package com.curevivedoctor.app.modules.profileprice.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.profileprice.`data`.model.Listgroup100000218ThreeRowModel
import com.curevivedoctor.app.modules.profileprice.`data`.model.ProfilePriceModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfilePriceVM : ViewModel(), KoinComponent {
  val profilePriceModel: MutableLiveData<ProfilePriceModel> = MutableLiveData(ProfilePriceModel())

  var navArguments: Bundle? = null

  val listgroup100000218ThreeList: MutableLiveData<MutableList<Listgroup100000218ThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
