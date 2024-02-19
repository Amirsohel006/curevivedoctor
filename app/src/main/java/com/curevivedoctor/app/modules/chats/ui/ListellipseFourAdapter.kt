package com.curevivedoctor.app.modules.chats.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipseFourBinding
import com.curevivedoctor.app.modules.chats.`data`.model.ListellipseFourRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseFourAdapter(
  var list: List<ListellipseFourRowModel>
) : RecyclerView.Adapter<ListellipseFourAdapter.RowListellipseFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipseFourVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse_four,parent,false)
    return RowListellipseFourVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipseFourVH, position: Int) {
    val listellipseFourRowModel = ListellipseFourRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipseFourRowModel = list[position]
    holder.binding.listellipseFourRowModel = listellipseFourRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipseFourRowModel>) {
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
      item: ListellipseFourRowModel
    ) {
    }
  }

  inner class RowListellipseFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipseFourBinding = RowListellipseFourBinding.bind(itemView)
    init {
      binding.btnFiveOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListellipseFourRowModel())
      }
    }
  }
}
