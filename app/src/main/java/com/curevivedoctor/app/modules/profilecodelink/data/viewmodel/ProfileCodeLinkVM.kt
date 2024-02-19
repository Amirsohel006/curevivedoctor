package com.curevivedoctor.app.modules.profilecodelink.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.profilecodelink.`data`.model.ProfileCodeLinkModel
import org.koin.core.KoinComponent

class ProfileCodeLinkVM : ViewModel(), KoinComponent {
  val profileCodeLinkModel: MutableLiveData<ProfileCodeLinkModel> =
      MutableLiveData(ProfileCodeLinkModel())

  var navArguments: Bundle? = null
}
