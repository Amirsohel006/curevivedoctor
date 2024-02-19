package com.curevivedoctor.app.modules.home.ui

import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityHomeBinding
import com.curevivedoctor.app.modules.home.`data`.model.Listellipse543RowModel
import com.curevivedoctor.app.modules.home.`data`.model.ListmarkspenceRowModel
import com.curevivedoctor.app.modules.home.`data`.model.ListpatientsRowModel
import com.curevivedoctor.app.modules.home.`data`.viewmodel.HomeVM
import com.curevivedoctor.app.modules.patientslist.ui.PatientsListActivity
import com.curevivedoctor.app.modules.schedulelist.ui.ScheduleListActivity
import com.curevivedoctor.app.modules.search.ui.SearchActivity
import com.curevivedoctor.app.modules.vitaldiabities.ui.VitalDiabitiesActivity
import com.curevivedoctor.app.modules.vitalhypertension.ui.VitalHypertensionActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmarkspenceAdapter =
    ListmarkspenceAdapter(viewModel.listmarkspenceList.value?:mutableListOf())
    binding.recyclerListmarkspence.adapter = listmarkspenceAdapter
    listmarkspenceAdapter.setOnItemClickListener(
    object : ListmarkspenceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmarkspenceRowModel) {
        onClickRecyclerListmarkspence(view, position, item)
      }
    }
    )
    viewModel.listmarkspenceList.observe(this) {
      listmarkspenceAdapter.updateData(it)
    }
    val listellipse543Adapter =
    Listellipse543Adapter(viewModel.listellipse543List.value?:mutableListOf())
    binding.recyclerListellipse543.adapter = listellipse543Adapter
    listellipse543Adapter.setOnItemClickListener(
    object : Listellipse543Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipse543RowModel) {
        onClickRecyclerListellipse543(view, position, item)
      }
    }
    )
    viewModel.listellipse543List.observe(this) {
      listellipse543Adapter.updateData(it)
    }
    val listpatientsAdapter =
    ListpatientsAdapter(viewModel.listpatientsList.value?:mutableListOf())
    binding.recyclerListpatients.adapter = listpatientsAdapter
    listpatientsAdapter.setOnItemClickListener(
    object : ListpatientsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpatientsRowModel) {
        onClickRecyclerListpatients(view, position, item)
      }
    }
    )
    viewModel.listpatientsList.observe(this) {
      listpatientsAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnarrowup.setOnClickListener {
      val destIntent = VitalDiabitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnsearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowviewall.setOnClickListener {
      val destIntent = ScheduleListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowviewallOne.setOnClickListener {
      val destIntent = PatientsListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnairplane.setOnClickListener {
      val destIntent = VitalHypertensionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListmarkspence(
    view: View,
    position: Int,
    item: ListmarkspenceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipse543(
    view: View,
    position: Int,
    item: Listellipse543RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListpatients(
    view: View,
    position: Int,
    item: ListpatientsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"

  }
}
