package com.curevivedoctor.app.modules.assetgenerated.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.assetgenerated.`data`.model.AssetGeneratedModel
import org.koin.core.KoinComponent

class AssetGeneratedVM : ViewModel(), KoinComponent {
  val assetGeneratedModel: MutableLiveData<AssetGeneratedModel> =
      MutableLiveData(AssetGeneratedModel())

  var navArguments: Bundle? = null
}
