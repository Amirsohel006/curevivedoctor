package com.curevivedoctor.app.modules.dietprotocol.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityDietProtocolBinding
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.Listellipse399OneRowModel
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.Listellipse399TwoRowModel
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.ListentermealRowModel
import com.curevivedoctor.app.modules.dietprotocol.`data`.viewmodel.DietProtocolVM
import com.curevivedoctor.app.modules.patientprofileone.ui.PatientProfileOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DietProtocolActivity :
    BaseActivity<ActivityDietProtocolBinding>(R.layout.activity_diet_protocol) {
  private val viewModel: DietProtocolVM by viewModels<DietProtocolVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listentermealAdapter =
    ListentermealAdapter(viewModel.listentermealList.value?:mutableListOf())
    binding.recyclerListentermeal.adapter = listentermealAdapter
    listentermealAdapter.setOnItemClickListener(
    object : ListentermealAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListentermealRowModel) {
        onClickRecyclerListentermeal(view, position, item)
      }
    }
    )
    viewModel.listentermealList.observe(this) {
      listentermealAdapter.updateData(it)
    }
    val listellipse399OneAdapter =
    Listellipse399OneAdapter(viewModel.listellipse399OneList.value?:mutableListOf())
    binding.recyclerListellipse399One.adapter = listellipse399OneAdapter
    listellipse399OneAdapter.setOnItemClickListener(
    object : Listellipse399OneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipse399OneRowModel) {
        onClickRecyclerListellipse399One(view, position, item)
      }
    }
    )
    viewModel.listellipse399OneList.observe(this) {
      listellipse399OneAdapter.updateData(it)
    }
    val listellipse399TwoAdapter =
    Listellipse399TwoAdapter(viewModel.listellipse399TwoList.value?:mutableListOf())
    binding.recyclerListellipse399Two.adapter = listellipse399TwoAdapter
    listellipse399TwoAdapter.setOnItemClickListener(
    object : Listellipse399TwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipse399TwoRowModel) {
        onClickRecyclerListellipse399Two(view, position, item)
      }
    }
    )
    viewModel.listellipse399TwoList.observe(this) {
      listellipse399TwoAdapter.updateData(it)
    }
    binding.dietProtocolVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = PatientProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListentermeal(
    view: View,
    position: Int,
    item: ListentermealRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipse399One(
    view: View,
    position: Int,
    item: Listellipse399OneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipse399Two(
    view: View,
    position: Int,
    item: Listellipse399TwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DIET_PROTOCOL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DietProtocolActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
