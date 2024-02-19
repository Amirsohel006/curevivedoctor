package com.curevivedoctor.app.modules.slots.ui

import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivitySlotsBinding
import com.curevivedoctor.app.modules.slots.`data`.model.SlotsRowModel
import com.curevivedoctor.app.modules.slots.`data`.viewmodel.SlotsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SlotsActivity : BaseActivity<ActivitySlotsBinding>(R.layout.activity_slots) {
  private val viewModel: SlotsVM by viewModels<SlotsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slotsAdapter = SlotsAdapter(viewModel.slotsList.value?:mutableListOf())
    binding.recyclerSlots.adapter = slotsAdapter
    slotsAdapter.setOnItemClickListener(
    object : SlotsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SlotsRowModel) {
        onClickRecyclerSlots(view, position, item)
      }
    }
    )
    viewModel.slotsList.observe(this) {
      slotsAdapter.updateData(it)
    }
    binding.slotsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSlots(
    view: View,
    position: Int,
    item: SlotsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SLOTS_ACTIVITY"

  }
}
