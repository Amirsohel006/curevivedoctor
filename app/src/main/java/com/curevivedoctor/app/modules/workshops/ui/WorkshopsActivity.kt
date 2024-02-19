package com.curevivedoctor.app.modules.workshops.ui

import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityWorkshopsBinding
import com.curevivedoctor.app.modules.workshops.`data`.model.Lists3RowModel
import com.curevivedoctor.app.modules.workshops.`data`.model.ListtOne3RowModel
import com.curevivedoctor.app.modules.workshops.`data`.model.ListwebinarRowModel
import com.curevivedoctor.app.modules.workshops.`data`.viewmodel.WorkshopsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WorkshopsActivity : BaseActivity<ActivityWorkshopsBinding>(R.layout.activity_workshops) {
  private val viewModel: WorkshopsVM by viewModels<WorkshopsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists3RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListtOne3RowModel) {
        onClickRecyclerListtOne(view, position, item)
      }
    }
    )
    viewModel.listtOneList.observe(this) {
      listtOneAdapter.updateData(it)
    }
    val listwebinarAdapter =
    ListwebinarAdapter(viewModel.listwebinarList.value?:mutableListOf())
    binding.recyclerListwebinar.adapter = listwebinarAdapter
    listwebinarAdapter.setOnItemClickListener(
    object : ListwebinarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListwebinarRowModel) {
        onClickRecyclerListwebinar(view, position, item)
      }
    }
    )
    viewModel.listwebinarList.observe(this) {
      listwebinarAdapter.updateData(it)
    }
    binding.workshopsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: Lists3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtOne(
    view: View,
    position: Int,
    item: ListtOne3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListwebinar(
    view: View,
    position: Int,
    item: ListwebinarRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "WORKSHOPS_ACTIVITY"

  }
}
