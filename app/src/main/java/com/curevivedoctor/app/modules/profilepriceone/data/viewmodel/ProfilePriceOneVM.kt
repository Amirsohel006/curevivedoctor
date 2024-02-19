package com.curevivedoctor.app.modules.profilepriceone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.profilepriceone.`data`.model.ProfilePriceOneModel
import org.koin.core.KoinComponent

class ProfilePriceOneVM : ViewModel(), KoinComponent {
  val profilePriceOneModel: MutableLiveData<ProfilePriceOneModel> =
      MutableLiveData(ProfilePriceOneModel())

  var navArguments: Bundle? = null
}
