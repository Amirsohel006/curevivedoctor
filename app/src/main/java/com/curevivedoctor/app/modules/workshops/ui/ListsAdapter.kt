package com.curevivedoctor.app.modules.workshops.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowLists3Binding
import com.curevivedoctor.app.modules.workshops.`data`.model.Lists3RowModel
import kotlin.Int
import kotlin.collections.List

class ListsAdapter(
  var list: List<Lists3RowModel>
) : RecyclerView.Adapter<ListsAdapter.RowLists3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLists3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lists3,parent,false)
    return RowLists3VH(view)
  }

  override fun onBindViewHolder(holder: RowLists3VH, position: Int) {
    val lists3RowModel = Lists3RowModel()
    // TODO uncomment following line after integration with data source
    // val lists3RowModel = list[position]
    holder.binding.lists3RowModel = lists3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Lists3RowModel>) {
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
      item: Lists3RowModel
    ) {
    }
  }

  inner class RowLists3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLists3Binding = RowLists3Binding.bind(itemView)
  }
}
