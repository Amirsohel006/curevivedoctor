package com.curevivedoctor.app.modules.schedulelist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityScheduleListBinding
import com.curevivedoctor.app.modules.schedulelist.`data`.model.ListsRowModel
import com.curevivedoctor.app.modules.schedulelist.`data`.model.ListtOneRowModel
import com.curevivedoctor.app.modules.schedulelist.`data`.viewmodel.ScheduleListVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScheduleListActivity :
    BaseActivity<ActivityScheduleListBinding>(R.layout.activity_schedule_list) {
  private val viewModel: ScheduleListVM by viewModels<ScheduleListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsRowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListtOneRowModel) {
        onClickRecyclerListtOne(view, position, item)
      }
    }
    )
    viewModel.listtOneList.observe(this) {
      listtOneAdapter.updateData(it)
    }
    binding.scheduleListVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: ListsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtOne(
    view: View,
    position: Int,
    item: ListtOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SCHEDULE_LIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScheduleListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
