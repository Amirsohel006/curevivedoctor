package com.curevivedoctor.app.modules.yogaprotocol.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.SpinnerAsanaCounterEightModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.SpinnerAsanaCounterNineModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.SpinnerAsanaCounterSevenModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.SpinnerAsanaCounterSixModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.SpinnerLanguageFourModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.SpinnerLanguageThreeModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.SpinnerWeburlModel
import com.curevivedoctor.app.modules.yogaprotocol.`data`.model.YogaProtocolModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class YogaProtocolVM : ViewModel(), KoinComponent {
  val yogaProtocolModel: MutableLiveData<YogaProtocolModel> = MutableLiveData(YogaProtocolModel())

  var navArguments: Bundle? = null

  val spinnerAsanaCounterSixList: MutableLiveData<MutableList<SpinnerAsanaCounterSixModel>> =
      MutableLiveData()

  val spinnerLanguageThreeList: MutableLiveData<MutableList<SpinnerLanguageThreeModel>> =
      MutableLiveData()

  val spinnerAsanaCounterSevenList: MutableLiveData<MutableList<SpinnerAsanaCounterSevenModel>> =
      MutableLiveData()

  val spinnerAsanaCounterEightList: MutableLiveData<MutableList<SpinnerAsanaCounterEightModel>> =
      MutableLiveData()

  val spinnerLanguageFourList: MutableLiveData<MutableList<SpinnerLanguageFourModel>> =
      MutableLiveData()

  val spinnerAsanaCounterNineList: MutableLiveData<MutableList<SpinnerAsanaCounterNineModel>> =
      MutableLiveData()

  val spinnerWeburlList: MutableLiveData<MutableList<SpinnerWeburlModel>> = MutableLiveData()
}
