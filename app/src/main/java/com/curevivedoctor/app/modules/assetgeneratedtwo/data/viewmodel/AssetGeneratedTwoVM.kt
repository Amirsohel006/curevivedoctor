package com.curevivedoctor.app.modules.assetgeneratedtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.assetgeneratedtwo.`data`.model.AssetGeneratedTwoModel
import org.koin.core.KoinComponent

class AssetGeneratedTwoVM : ViewModel(), KoinComponent {
  val assetGeneratedTwoModel: MutableLiveData<AssetGeneratedTwoModel> =
      MutableLiveData(AssetGeneratedTwoModel())

  var navArguments: Bundle? = null
}
