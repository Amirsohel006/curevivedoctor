package com.curevivedoctor.app.modules.yogaprotocolfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerAsanaCounterEightModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerAsanaCounterSevenModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerAsanaCounterSixModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerLanguageFourModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerLanguageThreeModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerWeburlModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.YogaProtocolFourModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class YogaProtocolFourVM : ViewModel(), KoinComponent {
  val yogaProtocolFourModel: MutableLiveData<YogaProtocolFourModel> =
      MutableLiveData(YogaProtocolFourModel())

  var navArguments: Bundle? = null

  val spinnerLanguageThreeList: MutableLiveData<MutableList<SpinnerLanguageThreeModel>> =
      MutableLiveData()

  val spinnerAsanaCounterSixList: MutableLiveData<MutableList<SpinnerAsanaCounterSixModel>> =
      MutableLiveData()

  val spinnerAsanaCounterSevenList: MutableLiveData<MutableList<SpinnerAsanaCounterSevenModel>> =
      MutableLiveData()

  val spinnerLanguageFourList: MutableLiveData<MutableList<SpinnerLanguageFourModel>> =
      MutableLiveData()

  val spinnerAsanaCounterEightList: MutableLiveData<MutableList<SpinnerAsanaCounterEightModel>> =
      MutableLiveData()

  val spinnerWeburlList: MutableLiveData<MutableList<SpinnerWeburlModel>> = MutableLiveData()
}
