package com.curevivedoctor.app.modules.dietprotocol.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipse399OneBinding
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.Listellipse399OneRowModel
import kotlin.Int
import kotlin.collections.List

class Listellipse399OneAdapter(
  var list: List<Listellipse399OneRowModel>
) : RecyclerView.Adapter<Listellipse399OneAdapter.RowListellipse399OneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse399OneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse399_one,parent,false)
    return RowListellipse399OneVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse399OneVH, position: Int) {
    val listellipse399OneRowModel = Listellipse399OneRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse399OneRowModel = list[position]
    holder.binding.listellipse399OneRowModel = listellipse399OneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse399OneRowModel>) {
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
      item: Listellipse399OneRowModel
    ) {
    }
  }

  inner class RowListellipse399OneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse399OneBinding = RowListellipse399OneBinding.bind(itemView)
  }
}
