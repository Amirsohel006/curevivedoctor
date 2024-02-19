package com.curevivedoctor.app.modules.frame.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListrectangleThirteenBinding
import com.curevivedoctor.app.modules.frame.`data`.model.ListrectangleThirteenRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleThirteenAdapter(
  var list: List<ListrectangleThirteenRowModel>
) : RecyclerView.Adapter<ListrectangleThirteenAdapter.RowListrectangleThirteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangleThirteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle_thirteen,parent,false)
    return RowListrectangleThirteenVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleThirteenVH, position: Int) {
    val listrectangleThirteenRowModel = ListrectangleThirteenRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleThirteenRowModel = list[position]
    holder.binding.listrectangleThirteenRowModel = listrectangleThirteenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleThirteenRowModel>) {
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
      item: ListrectangleThirteenRowModel
    ) {
    }
  }

  inner class RowListrectangleThirteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleThirteenBinding = RowListrectangleThirteenBinding.bind(itemView)
  }
}
