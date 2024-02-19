package com.curevivedoctor.app.modules.accupressureprotocol.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListenterpointSixBinding
import com.curevivedoctor.app.modules.accupressureprotocol.`data`.model.ListenterpointSixRowModel
import kotlin.Int
import kotlin.collections.List

class ListenterpointSixAdapter(
  var list: List<ListenterpointSixRowModel>
) : RecyclerView.Adapter<ListenterpointSixAdapter.RowListenterpointSixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListenterpointSixVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listenterpoint_six,parent,false)
    return RowListenterpointSixVH(view)
  }

  override fun onBindViewHolder(holder: RowListenterpointSixVH, position: Int) {
    val listenterpointSixRowModel = ListenterpointSixRowModel()
    // TODO uncomment following line after integration with data source
    // val listenterpointSixRowModel = list[position]
    holder.binding.listenterpointSixRowModel = listenterpointSixRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListenterpointSixRowModel>) {
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
      item: ListenterpointSixRowModel
    ) {
    }
  }

  inner class RowListenterpointSixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListenterpointSixBinding = RowListenterpointSixBinding.bind(itemView)
  }
}
