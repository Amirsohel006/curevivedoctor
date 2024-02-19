package com.curevivedoctor.app.modules.vitalhypertension.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityVitalHypertensionBinding
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.Listellipse544RowModel
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.Lists1RowModel
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.ListtOne1RowModel
import com.curevivedoctor.app.modules.vitalhypertension.`data`.viewmodel.VitalHypertensionVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VitalHypertensionActivity :
    BaseActivity<ActivityVitalHypertensionBinding>(R.layout.activity_vital_hypertension) {
  private val viewModel: VitalHypertensionVM by viewModels<VitalHypertensionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListtOne1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Listellipse544RowModel) {
        onClickRecyclerListellipse544(view, position, item)
      }
    }
    )
    viewModel.listellipse544List.observe(this) {
      listellipse544Adapter.updateData(it)
    }
    binding.vitalHypertensionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: Lists1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtOne(
    view: View,
    position: Int,
    item: ListtOne1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipse544(
    view: View,
    position: Int,
    item: Listellipse544RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VITAL_HYPERTENSION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VitalHypertensionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
