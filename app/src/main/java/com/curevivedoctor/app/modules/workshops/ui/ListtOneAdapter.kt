package com.curevivedoctor.app.modules.workshops.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListtOne3Binding
import com.curevivedoctor.app.modules.workshops.`data`.model.ListtOne3RowModel
import kotlin.Int
import kotlin.collections.List

class ListtOneAdapter(
  var list: List<ListtOne3RowModel>
) : RecyclerView.Adapter<ListtOneAdapter.RowListtOne3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtOne3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listt_one3,parent,false)
    return RowListtOne3VH(view)
  }

  override fun onBindViewHolder(holder: RowListtOne3VH, position: Int) {
    val listtOne3RowModel = ListtOne3RowModel()
    // TODO uncomment following line after integration with data source
    // val listtOne3RowModel = list[position]
    holder.binding.listtOne3RowModel = listtOne3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtOne3RowModel>) {
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
      item: ListtOne3RowModel
    ) {
    }
  }

  inner class RowListtOne3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtOne3Binding = RowListtOne3Binding.bind(itemView)
  }
}
