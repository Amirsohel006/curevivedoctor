package com.curevivedoctor.app.modules.accupressureprotocol.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListenterpointBinding
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointRowModel
import kotlin.Int
import kotlin.collections.List

class ListenterpointAdapter(
  var list: List<ListenterpointRowModel>
) : RecyclerView.Adapter<ListenterpointAdapter.RowListenterpointVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListenterpointVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listenterpoint,parent,false)
    return RowListenterpointVH(view)
  }

  override fun onBindViewHolder(holder: RowListenterpointVH, position: Int) {
    val listenterpointRowModel = ListenterpointRowModel()
    // TODO uncomment following line after integration with data source
    // val listenterpointRowModel = list[position]
    holder.binding.listenterpointRowModel = listenterpointRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListenterpointRowModel>) {
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
      item: ListenterpointRowModel
    ) {
    }
  }

  inner class RowListenterpointVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListenterpointBinding = RowListenterpointBinding.bind(itemView)
  }
}
