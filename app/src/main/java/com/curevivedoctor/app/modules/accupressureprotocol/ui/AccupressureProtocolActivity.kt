package com.curevivedoctor.app.modules.accupressureprotocol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityAccupressureProtocolBinding
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointRowModel
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointSixRowModel
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointThreeRowModel
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.viewmodel.AccupressureProtocolVM
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccupressureProtocolActivity :
    BaseActivity<ActivityAccupressureProtocolBinding>(R.layout.activity_accupressure_protocol) {
  private val viewModel: AccupressureProtocolVM by viewModels<AccupressureProtocolVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listenterpointAdapter =
    ListenterpointAdapter(viewModel.listenterpointList.value?:mutableListOf())
    binding.recyclerListenterpoint.adapter = listenterpointAdapter
    listenterpointAdapter.setOnItemClickListener(
    object : ListenterpointAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListenterpointRowModel) {
        onClickRecyclerListenterpoint(view, position, item)
      }
    }
    )
    viewModel.listenterpointList.observe(this) {
      listenterpointAdapter.updateData(it)
    }
    val listenterpointThreeAdapter =
    ListenterpointThreeAdapter(viewModel.listenterpointThreeList.value?:mutableListOf())
    binding.recyclerListenterpointThree.adapter = listenterpointThreeAdapter
    listenterpointThreeAdapter.setOnItemClickListener(
    object : ListenterpointThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListenterpointThreeRowModel) {
        onClickRecyclerListenterpointThree(view, position, item)
      }
    }
    )
    viewModel.listenterpointThreeList.observe(this) {
      listenterpointThreeAdapter.updateData(it)
    }
    val listenterpointSixAdapter =
    ListenterpointSixAdapter(viewModel.listenterpointSixList.value?:mutableListOf())
    binding.recyclerListenterpointSix.adapter = listenterpointSixAdapter
    listenterpointSixAdapter.setOnItemClickListener(
    object : ListenterpointSixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListenterpointSixRowModel) {
        onClickRecyclerListenterpointSix(view, position, item)
      }
    }
    )
    viewModel.listenterpointSixList.observe(this) {
      listenterpointSixAdapter.updateData(it)
    }
    binding.accupressureProtocolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListenterpoint(
    view: View,
    position: Int,
    item: ListenterpointRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListenterpointThree(
    view: View,
    position: Int,
    item: ListenterpointThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListenterpointSix(
    view: View,
    position: Int,
    item: ListenterpointSixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACCUPRESSURE_PROTOCOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccupressureProtocolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
