package com.curevivedoctor.app.modules.vitalhypertension.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipse544Binding
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.Listellipse544RowModel
import kotlin.Int
import kotlin.collections.List

class Listellipse544Adapter(
  var list: List<Listellipse544RowModel>
) : RecyclerView.Adapter<Listellipse544Adapter.RowListellipse544VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse544VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse544,parent,false)
    return RowListellipse544VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse544VH, position: Int) {
    val listellipse544RowModel = Listellipse544RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse544RowModel = list[position]
    holder.binding.listellipse544RowModel = listellipse544RowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse544RowModel>) {
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
      item: Listellipse544RowModel
    ) {
    }
  }

  inner class RowListellipse544VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse544Binding = RowListellipse544Binding.bind(itemView)
  }
}
