package com.curevivedoctor.app.modules.vitaldiabities.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipse545Binding
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.Listellipse545RowModel
import kotlin.Int
import kotlin.collections.List

class Listellipse544Adapter(
  var list: List<Listellipse545RowModel>
) : RecyclerView.Adapter<Listellipse544Adapter.RowListellipse545VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse545VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse545,parent,false)
    return RowListellipse545VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse545VH, position: Int) {
    val listellipse545RowModel = Listellipse545RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse545RowModel = list[position]
    holder.binding.listellipse545RowModel = listellipse545RowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse545RowModel>) {
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
      item: Listellipse545RowModel
    ) {
    }
  }

  inner class RowListellipse545VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse545Binding = RowListellipse545Binding.bind(itemView)
  }
}
