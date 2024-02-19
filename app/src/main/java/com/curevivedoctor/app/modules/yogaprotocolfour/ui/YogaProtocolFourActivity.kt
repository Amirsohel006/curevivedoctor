package com.curevivedoctor.app.modules.yogaprotocolfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityYogaProtocolFourBinding
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerAsanaCounterEightModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerAsanaCounterSevenModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerAsanaCounterSixModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerLanguageFourModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerLanguageThreeModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.model.SpinnerWeburlModel
import com.curevivedoctor.app.modules.yogaprotocolfour.`data`.viewmodel.YogaProtocolFourVM
import com.curevivedoctor.app.modules.yogaprotocolthree.ui.YogaProtocolThreeActivity
import com.curevivedoctor.app.modules.yogaprotocoltwo.ui.YogaProtocolTwoActivity
import kotlin.String
import kotlin.Unit

class YogaProtocolFourActivity :
    BaseActivity<ActivityYogaProtocolFourBinding>(R.layout.activity_yoga_protocol_four) {
  private val viewModel: YogaProtocolFourVM by viewModels<YogaProtocolFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerLanguageThreeList.value = mutableListOf(
    SpinnerLanguageThreeModel("Item1"),
    SpinnerLanguageThreeModel("Item2"),
    SpinnerLanguageThreeModel("Item3"),
    SpinnerLanguageThreeModel("Item4"),
    SpinnerLanguageThreeModel("Item5")
    )
    val spinnerLanguageThreeAdapter =
    SpinnerLanguageThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageThreeList.value?:
    mutableListOf())
    binding.spinnerLanguageThree.adapter = spinnerLanguageThreeAdapter
    viewModel.spinnerAsanaCounterSixList.value = mutableListOf(
    SpinnerAsanaCounterSixModel("Item1"),
    SpinnerAsanaCounterSixModel("Item2"),
    SpinnerAsanaCounterSixModel("Item3"),
    SpinnerAsanaCounterSixModel("Item4"),
    SpinnerAsanaCounterSixModel("Item5")
    )
    val spinnerAsanaCounterSixAdapter =
    SpinnerAsanaCounterSixAdapter(this,R.layout.spinner_item,viewModel.spinnerAsanaCounterSixList.value?:
    mutableListOf())
    binding.spinnerAsanaCounterSix.adapter = spinnerAsanaCounterSixAdapter
    viewModel.spinnerAsanaCounterSevenList.value = mutableListOf(
    SpinnerAsanaCounterSevenModel("Item1"),
    SpinnerAsanaCounterSevenModel("Item2"),
    SpinnerAsanaCounterSevenModel("Item3"),
    SpinnerAsanaCounterSevenModel("Item4"),
    SpinnerAsanaCounterSevenModel("Item5")
    )
    val spinnerAsanaCounterSevenAdapter =
    SpinnerAsanaCounterSevenAdapter(this,R.layout.spinner_item,viewModel.spinnerAsanaCounterSevenList.value?:
    mutableListOf())
    binding.spinnerAsanaCounterSeven.adapter = spinnerAsanaCounterSevenAdapter
    viewModel.spinnerLanguageFourList.value = mutableListOf(
    SpinnerLanguageFourModel("Item1"),
    SpinnerLanguageFourModel("Item2"),
    SpinnerLanguageFourModel("Item3"),
    SpinnerLanguageFourModel("Item4"),
    SpinnerLanguageFourModel("Item5")
    )
    val spinnerLanguageFourAdapter =
    SpinnerLanguageFourAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageFourList.value?:
    mutableListOf())
    binding.spinnerLanguageFour.adapter = spinnerLanguageFourAdapter
    viewModel.spinnerAsanaCounterEightList.value = mutableListOf(
    SpinnerAsanaCounterEightModel("Item1"),
    SpinnerAsanaCounterEightModel("Item2"),
    SpinnerAsanaCounterEightModel("Item3"),
    SpinnerAsanaCounterEightModel("Item4"),
    SpinnerAsanaCounterEightModel("Item5")
    )
    val spinnerAsanaCounterEightAdapter =
    SpinnerAsanaCounterEightAdapter(this,R.layout.spinner_item,viewModel.spinnerAsanaCounterEightList.value?:
    mutableListOf())
    binding.spinnerAsanaCounterEight.adapter = spinnerAsanaCounterEightAdapter
    viewModel.spinnerWeburlList.value = mutableListOf(
    SpinnerWeburlModel("Item1"),
    SpinnerWeburlModel("Item2"),
    SpinnerWeburlModel("Item3"),
    SpinnerWeburlModel("Item4"),
    SpinnerWeburlModel("Item5")
    )
    val spinnerWeburlAdapter =
    SpinnerWeburlAdapter(this,R.layout.spinner_item,viewModel.spinnerWeburlList.value?:
    mutableListOf())
    binding.spinnerWeburl.adapter = spinnerWeburlAdapter
    binding.yogaProtocolFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSkip.setOnClickListener {
      val destIntent = YogaProtocolThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowasanacounterNine.setOnClickListener {
      val destIntent = YogaProtocolTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "YOGA_PROTOCOL_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YogaProtocolFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
