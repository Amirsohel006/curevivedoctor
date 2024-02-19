package com.curevivedoctor.app.modules.querypopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.querypopup.`data`.model.QueryPopUpModel
import org.koin.core.KoinComponent

class QueryPopUpVM : ViewModel(), KoinComponent {
  val queryPopUpModel: MutableLiveData<QueryPopUpModel> = MutableLiveData(QueryPopUpModel())

  var navArguments: Bundle? = null
}
