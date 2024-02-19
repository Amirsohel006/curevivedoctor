package com.curevivedoctor.app.modules.vitaldiabities.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowLists2Binding
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.Lists2RowModel
import kotlin.Int
import kotlin.collections.List

class ListsAdapter(
  var list: List<Lists2RowModel>
) : RecyclerView.Adapter<ListsAdapter.RowLists2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLists2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lists2,parent,false)
    return RowLists2VH(view)
  }

  override fun onBindViewHolder(holder: RowLists2VH, position: Int) {
    val lists2RowModel = Lists2RowModel()
    // TODO uncomment following line after integration with data source
    // val lists2RowModel = list[position]
    holder.binding.lists2RowModel = lists2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Lists2RowModel>) {
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
      item: Lists2RowModel
    ) {
    }
  }

  inner class RowLists2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLists2Binding = RowLists2Binding.bind(itemView)
  }
}
