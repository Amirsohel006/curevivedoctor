package com.curevivedoctor.app.modules.vitaldiabities.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityVitalDiabitiesBinding
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.Listellipse545RowModel
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.Lists2RowModel
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.ListtOne2RowModel
import com.curevivedoctor.app.modules.vitaldiabities.`data`.viewmodel.VitalDiabitiesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VitalDiabitiesActivity :
    BaseActivity<ActivityVitalDiabitiesBinding>(R.layout.activity_vital_diabities) {
  private val viewModel: VitalDiabitiesVM by viewModels<VitalDiabitiesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists2RowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(this) {
      listsAdapter.updateData(it)
    }
    val listtOneAdapter = ListtOneAdapter(viewModel.listtOneList.value?:mutableListOf())
    binding.recyclerListtOne.adapter = listtOneAdapter
    listtOneAdapter.setOnItemClickListener(
    object : ListtOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtOne2RowModel) {
        onClickRecyclerListtOne(view, position, item)
      }
    }
    )
    viewModel.listtOneList.observe(this) {
      listtOneAdapter.updateData(it)
    }
    val listellipse544Adapter =
    Listellipse544Adapter(viewModel.listellipse544List.value?:mutableListOf())
    binding.recyclerListellipse544.adapter = listellipse544Adapter
    listellipse544Adapter.setOnItemClickListener(
    object : Listellipse544Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipse545RowModel) {
        onClickRecyclerListellipse544(view, position, item)
      }
    }
    )
    viewModel.listellipse544List.observe(this) {
      listellipse544Adapter.updateData(it)
    }
    binding.vitalDiabitiesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: Lists2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtOne(
    view: View,
    position: Int,
    item: ListtOne2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipse544(
    view: View,
    position: Int,
    item: Listellipse545RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VITAL_DIABITIES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VitalDiabitiesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
