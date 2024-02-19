package com.curevivedoctor.app.modules.dietprotocol.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListellipse399TwoBinding
import com.curevivedoctor.app.modules.dietprotocol.`data`.model.Listellipse399TwoRowModel
import kotlin.Int
import kotlin.collections.List

class Listellipse399TwoAdapter(
  var list: List<Listellipse399TwoRowModel>
) : RecyclerView.Adapter<Listellipse399TwoAdapter.RowListellipse399TwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse399TwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse399_two,parent,false)
    return RowListellipse399TwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse399TwoVH, position: Int) {
    val listellipse399TwoRowModel = Listellipse399TwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse399TwoRowModel = list[position]
    holder.binding.listellipse399TwoRowModel = listellipse399TwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse399TwoRowModel>) {
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
      item: Listellipse399TwoRowModel
    ) {
    }
  }

  inner class RowListellipse399TwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse399TwoBinding = RowListellipse399TwoBinding.bind(itemView)
  }
}
