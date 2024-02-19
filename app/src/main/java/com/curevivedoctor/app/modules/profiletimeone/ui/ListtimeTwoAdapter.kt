package com.curevivedoctor.app.modules.profiletimeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListtimeTwo1Binding
import com.curevivedoctor.app.modules.profiletimeone.`data`.model.ListtimeTwo1RowModel
import kotlin.Int
import kotlin.collections.List

class ListtimeTwoAdapter(
  var list: List<ListtimeTwo1RowModel>
) : RecyclerView.Adapter<ListtimeTwoAdapter.RowListtimeTwo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtimeTwo1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtime_two1,parent,false)
    return RowListtimeTwo1VH(view)
  }

  override fun onBindViewHolder(holder: RowListtimeTwo1VH, position: Int) {
    val listtimeTwo1RowModel = ListtimeTwo1RowModel()
    // TODO uncomment following line after integration with data source
    // val listtimeTwo1RowModel = list[position]
    holder.binding.listtimeTwo1RowModel = listtimeTwo1RowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtimeTwo1RowModel>) {
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
      item: ListtimeTwo1RowModel
    ) {
    }
  }

  inner class RowListtimeTwo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtimeTwo1Binding = RowListtimeTwo1Binding.bind(itemView)
  }
}
