package com.curevivedoctor.app.modules.accupressureprotocol.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListenterpointThreeBinding
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListenterpointThreeAdapter(
  var list: List<ListenterpointThreeRowModel>
) : RecyclerView.Adapter<ListenterpointThreeAdapter.RowListenterpointThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListenterpointThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listenterpoint_three,parent,false)
    return RowListenterpointThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListenterpointThreeVH, position: Int) {
    val listenterpointThreeRowModel = ListenterpointThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listenterpointThreeRowModel = list[position]
    holder.binding.listenterpointThreeRowModel = listenterpointThreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListenterpointThreeRowModel>) {
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
      item: ListenterpointThreeRowModel
    ) {
    }
  }

  inner class RowListenterpointThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListenterpointThreeBinding = RowListenterpointThreeBinding.bind(itemView)
  }
}
