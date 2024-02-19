package com.curevivedoctor.app.modules.assetgeneratedone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.assetgeneratedone.`data`.model.AssetGeneratedOneModel
import org.koin.core.KoinComponent

class AssetGeneratedOneVM : ViewModel(), KoinComponent {
  val assetGeneratedOneModel: MutableLiveData<AssetGeneratedOneModel> =
      MutableLiveData(AssetGeneratedOneModel())

  var navArguments: Bundle? = null
}
