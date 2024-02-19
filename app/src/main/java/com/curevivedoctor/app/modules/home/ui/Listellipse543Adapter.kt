package com.curevivedoctor.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipse543Binding
import com.curevivedoctor.app.modules.home.`data`.model.Listellipse543RowModel
import kotlin.Int
import kotlin.collections.List

class Listellipse543Adapter(
  var list: List<Listellipse543RowModel>
) : RecyclerView.Adapter<Listellipse543Adapter.RowListellipse543VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse543VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse543,parent,false)
    return RowListellipse543VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse543VH, position: Int) {
    val listellipse543RowModel = Listellipse543RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse543RowModel = list[position]
    holder.binding.listellipse543RowModel = listellipse543RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse543RowModel>) {
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
      item: Listellipse543RowModel
    ) {
    }
  }

  inner class RowListellipse543VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse543Binding = RowListellipse543Binding.bind(itemView)
  }
}
