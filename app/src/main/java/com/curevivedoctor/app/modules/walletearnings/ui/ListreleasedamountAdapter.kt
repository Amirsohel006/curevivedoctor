package com.curevivedoctor.app.modules.walletearnings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListreleasedamountBinding
import com.curevivedoctor.app.modules.walletearnings.`data`.model.ListreleasedamountRowModel
import kotlin.Int
import kotlin.collections.List

class ListreleasedamountAdapter(
  var list: List<ListreleasedamountRowModel>
) : RecyclerView.Adapter<ListreleasedamountAdapter.RowListreleasedamountVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListreleasedamountVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listreleasedamount,parent,false)
    return RowListreleasedamountVH(view)
  }

  override fun onBindViewHolder(holder: RowListreleasedamountVH, position: Int) {
    val listreleasedamountRowModel = ListreleasedamountRowModel()
    // TODO uncomment following line after integration with data source
    // val listreleasedamountRowModel = list[position]
    holder.binding.listreleasedamountRowModel = listreleasedamountRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListreleasedamountRowModel>) {
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
      item: ListreleasedamountRowModel
    ) {
    }
  }

  inner class RowListreleasedamountVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListreleasedamountBinding = RowListreleasedamountBinding.bind(itemView)
  }
}
