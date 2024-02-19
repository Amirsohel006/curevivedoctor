package com.curevivedoctor.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListpatientsBinding
import com.curevivedoctor.app.modules.home.`data`.model.ListpatientsRowModel
import kotlin.Int
import kotlin.collections.List

class ListpatientsAdapter(
  var list: List<ListpatientsRowModel>
) : RecyclerView.Adapter<ListpatientsAdapter.RowListpatientsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpatientsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpatients,parent,false)
    return RowListpatientsVH(view)
  }

  override fun onBindViewHolder(holder: RowListpatientsVH, position: Int) {
    val listpatientsRowModel = ListpatientsRowModel()
    // TODO uncomment following line after integration with data source
    // val listpatientsRowModel = list[position]
    holder.binding.listpatientsRowModel = listpatientsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpatientsRowModel>) {
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
      item: ListpatientsRowModel
    ) {
    }
  }

  inner class RowListpatientsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpatientsBinding = RowListpatientsBinding.bind(itemView)
  }
}
