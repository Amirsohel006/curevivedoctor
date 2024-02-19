package com.curevivedoctor.app.modules.frame.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListrectangleFifteenBinding
import com.curevivedoctor.app.modules.frame.`data`.model.ListrectangleFifteenRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleFifteenAdapter(
  var list: List<ListrectangleFifteenRowModel>
) : RecyclerView.Adapter<ListrectangleFifteenAdapter.RowListrectangleFifteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangleFifteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle_fifteen,parent,false)
    return RowListrectangleFifteenVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleFifteenVH, position: Int) {
    val listrectangleFifteenRowModel = ListrectangleFifteenRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleFifteenRowModel = list[position]
    holder.binding.listrectangleFifteenRowModel = listrectangleFifteenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleFifteenRowModel>) {
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
      item: ListrectangleFifteenRowModel
    ) {
    }
  }

  inner class RowListrectangleFifteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleFifteenBinding = RowListrectangleFifteenBinding.bind(itemView)
  }
}
