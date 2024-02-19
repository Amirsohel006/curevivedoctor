package com.curevivedoctor.app.modules.patientprofileone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityPatientProfileOneBinding
import com.curevivedoctor.app.modules.accupressureprotocol.ui.AccupressureProtocolActivity
import com.curevivedoctor.app.modules.aromaprotocol.ui.AromaProtocolActivity
import com.curevivedoctor.app.modules.dietprotocol.ui.DietProtocolActivity
import com.curevivedoctor.app.modules.herbologyprotocol.ui.HerbologyprotocolActivity
import com.curevivedoctor.app.modules.hydrotherapyprotocol.ui.HydrotherapyprotocolActivity
import com.curevivedoctor.app.modules.patientfile.ui.PatientFileActivity
import com.curevivedoctor.app.modules.patientprofileone.`data`.model.ListmoRowModel
import com.curevivedoctor.app.modules.patientprofileone.`data`.viewmodel.PatientProfileOneVM
import com.curevivedoctor.app.modules.tips.ui.TipsActivity
import com.curevivedoctor.app.modules.treatmentcard.ui.TreatmentCardActivity
import com.curevivedoctor.app.modules.yogaprotocolthree.ui.YogaProtocolThreeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PatientProfileOneActivity :
    BaseActivity<ActivityPatientProfileOneBinding>(R.layout.activity_patient_profile_one) {
  private val viewModel: PatientProfileOneVM by viewModels<PatientProfileOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmoAdapter = ListmoAdapter(viewModel.listmoList.value?:mutableListOf())
    binding.recyclerListmo.adapter = listmoAdapter
    listmoAdapter.setOnItemClickListener(
    object : ListmoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmoRowModel) {
        onClickRecyclerListmo(view, position, item)
      }
    }
    )
    viewModel.listmoList.observe(this) {
      listmoAdapter.updateData(it)
    }
    binding.patientProfileOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowgoogledocsone.setOnClickListener {
      val destIntent = PatientFileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFillFormOne.setOnClickListener {
      val destIntent = AccupressureProtocolActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFillFormTwo.setOnClickListener {
      val destIntent = DietProtocolActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFillForm.setOnClickListener {
      val destIntent = HydrotherapyprotocolActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnViewedit.setOnClickListener {
      val destIntent = YogaProtocolThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumntreatmentCard.setOnClickListener {
      val destIntent = TreatmentCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFillFormFive.setOnClickListener {
      val destIntent = TipsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFillFormThree.setOnClickListener {
      val destIntent = HerbologyprotocolActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFillFormFour.setOnClickListener {
      val destIntent = AromaProtocolActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListmo(
    view: View,
    position: Int,
    item: ListmoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PATIENT_PROFILE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PatientProfileOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
