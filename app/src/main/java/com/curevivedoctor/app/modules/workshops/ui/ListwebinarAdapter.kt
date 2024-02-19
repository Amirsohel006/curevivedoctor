package com.curevivedoctor.app.modules.workshops.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListwebinarBinding
import com.curevivedoctor.app.modules.workshops.`data`.model.ListwebinarRowModel
import kotlin.Int
import kotlin.collections.List

class ListwebinarAdapter(
  var list: List<ListwebinarRowModel>
) : RecyclerView.Adapter<ListwebinarAdapter.RowListwebinarVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListwebinarVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listwebinar,parent,false)
    return RowListwebinarVH(view)
  }

  override fun onBindViewHolder(holder: RowListwebinarVH, position: Int) {
    val listwebinarRowModel = ListwebinarRowModel()
    // TODO uncomment following line after integration with data source
    // val listwebinarRowModel = list[position]
    holder.binding.listwebinarRowModel = listwebinarRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListwebinarRowModel>) {
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
      item: ListwebinarRowModel
    ) {
    }
  }

  inner class RowListwebinarVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListwebinarBinding = RowListwebinarBinding.bind(itemView)
  }
}
