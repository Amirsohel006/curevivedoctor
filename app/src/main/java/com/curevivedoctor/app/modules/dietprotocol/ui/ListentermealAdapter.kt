package com.curevivedoctor.app.modules.dietprotocol.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListentermealBinding
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.ListentermealRowModel
import kotlin.Int
import kotlin.collections.List

class ListentermealAdapter(
  var list: List<ListentermealRowModel>
) : RecyclerView.Adapter<ListentermealAdapter.RowListentermealVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListentermealVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listentermeal,parent,false)
    return RowListentermealVH(view)
  }

  override fun onBindViewHolder(holder: RowListentermealVH, position: Int) {
    val listentermealRowModel = ListentermealRowModel()
    // TODO uncomment following line after integration with data source
    // val listentermealRowModel = list[position]
    holder.binding.listentermealRowModel = listentermealRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListentermealRowModel>) {
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
      item: ListentermealRowModel
    ) {
    }
  }

  inner class RowListentermealVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListentermealBinding = RowListentermealBinding.bind(itemView)
  }
}
