package com.curevivedoctor.app.modules.schedulelist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListtOneBinding
import com.curevivedoctor.app.modules.schedulelist.`data`.model.ListtOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListtOneAdapter(
  var list: List<ListtOneRowModel>
) : RecyclerView.Adapter<ListtOneAdapter.RowListtOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listt_one,parent,false)
    return RowListtOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListtOneVH, position: Int) {
    val listtOneRowModel = ListtOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listtOneRowModel = list[position]
    holder.binding.listtOneRowModel = listtOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtOneRowModel>) {
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
      item: ListtOneRowModel
    ) {
    }
  }

  inner class RowListtOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtOneBinding = RowListtOneBinding.bind(itemView)
  }
}
