package com.curevivedoctor.app.modules.slots.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowSlotsBinding
import com.curevivedoctor.app.modules.slots.`data`.model.SlotsRowModel
import kotlin.Int
import kotlin.collections.List

class SlotsAdapter(
  var list: List<SlotsRowModel>
) : RecyclerView.Adapter<SlotsAdapter.RowSlotsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSlotsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_slots,parent,false)
    return RowSlotsVH(view)
  }

  override fun onBindViewHolder(holder: RowSlotsVH, position: Int) {
    val slotsRowModel = SlotsRowModel()
    // TODO uncomment following line after integration with data source
    // val slotsRowModel = list[position]
    holder.binding.slotsRowModel = slotsRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SlotsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SlotsRowModel
    ) {
    }
  }

  inner class RowSlotsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSlotsBinding = RowSlotsBinding.bind(itemView)
  }
}
