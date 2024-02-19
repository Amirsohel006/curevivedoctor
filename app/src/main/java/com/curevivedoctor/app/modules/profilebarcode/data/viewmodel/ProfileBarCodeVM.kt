package com.curevivedoctor.app.modules.profilebarcode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.profilebarcode.`data`.model.ProfileBarCodeModel
import org.koin.core.KoinComponent

class ProfileBarCodeVM : ViewModel(), KoinComponent {
  val profileBarCodeModel: MutableLiveData<ProfileBarCodeModel> =
      MutableLiveData(ProfileBarCodeModel())

  var navArguments: Bundle? = null
}
