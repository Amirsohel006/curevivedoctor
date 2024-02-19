package com.curevivedoctor.app.modules.frame.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipseEightBinding
import com.curevivedoctor.app.modules.frame.`data`.model.ListellipseEightRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseEightAdapter(
  var list: List<ListellipseEightRowModel>
) : RecyclerView.Adapter<ListellipseEightAdapter.RowListellipseEightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipseEightVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse_eight,parent,false)
    return RowListellipseEightVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipseEightVH, position: Int) {
    val listellipseEightRowModel = ListellipseEightRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipseEightRowModel = list[position]
    holder.binding.listellipseEightRowModel = listellipseEightRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipseEightRowModel>) {
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
      item: ListellipseEightRowModel
    ) {
    }
  }

  inner class RowListellipseEightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipseEightBinding = RowListellipseEightBinding.bind(itemView)
  }
}
