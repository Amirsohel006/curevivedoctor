package com.curevivedoctor.app.modules.treatmentcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.treatmentcard.`data`.model.TreatmentCardModel
import org.koin.core.KoinComponent

class TreatmentCardVM : ViewModel(), KoinComponent {
  val treatmentCardModel: MutableLiveData<TreatmentCardModel> =
      MutableLiveData(TreatmentCardModel())

  var navArguments: Bundle? = null
}
