package com.curevivedoctor.app.modules.chats.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipseBinding
import com.curevivedoctor.app.modules.chats.`data`.model.ListellipseRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseAdapter(
  var list: List<ListellipseRowModel>
) : RecyclerView.Adapter<ListellipseAdapter.RowListellipseVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipseVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse,parent,false)
    return RowListellipseVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipseVH, position: Int) {
    val listellipseRowModel = ListellipseRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipseRowModel = list[position]
    holder.binding.listellipseRowModel = listellipseRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipseRowModel>) {
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
      item: ListellipseRowModel
    ) {
    }
  }

  inner class RowListellipseVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipseBinding = RowListellipseBinding.bind(itemView)
    init {
      binding.btnFive.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListellipseRowModel())
      }
    }
  }
}
