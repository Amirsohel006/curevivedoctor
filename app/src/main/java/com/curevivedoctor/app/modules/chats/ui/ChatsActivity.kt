package com.curevivedoctor.app.modules.chats.ui

import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityChatsBinding
import com.curevivedoctor.app.modules.chats.`data`.model.ListellipseFourRowModel
import com.curevivedoctor.app.modules.chats.`data`.model.ListellipseRowModel
import com.curevivedoctor.app.modules.chats.`data`.viewmodel.ChatsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatsActivity : BaseActivity<ActivityChatsBinding>(R.layout.activity_chats) {
  private val viewModel: ChatsVM by viewModels<ChatsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseAdapter =
    ListellipseAdapter(viewModel.listellipseList.value?:mutableListOf())
    binding.recyclerListellipse.adapter = listellipseAdapter
    listellipseAdapter.setOnItemClickListener(
    object : ListellipseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseRowModel) {
        onClickRecyclerListellipse(view, position, item)
      }
    }
    )
    viewModel.listellipseList.observe(this) {
      listellipseAdapter.updateData(it)
    }
    val listellipseFourAdapter =
    ListellipseFourAdapter(viewModel.listellipseFourList.value?:mutableListOf())
    binding.recyclerListellipseFour.adapter = listellipseFourAdapter
    listellipseFourAdapter.setOnItemClickListener(
    object : ListellipseFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseFourRowModel) {
        onClickRecyclerListellipseFour(view, position, item)
      }
    }
    )
    viewModel.listellipseFourList.observe(this) {
      listellipseFourAdapter.updateData(it)
    }
    binding.chatsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipse(
    view: View,
    position: Int,
    item: ListellipseRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipseFour(
    view: View,
    position: Int,
    item: ListellipseFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHATS_ACTIVITY"

  }
}
