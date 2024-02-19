package com.curevivedoctor.app.modules.vitalhypertension.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListtOne1Binding
import com.curevivedoctor.app.modules.vitalhypertension.`data`.model.ListtOne1RowModel
import kotlin.Int
import kotlin.collections.List

class ListtOneAdapter(
  var list: List<ListtOne1RowModel>
) : RecyclerView.Adapter<ListtOneAdapter.RowListtOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtOne1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listt_one1,parent,false)
    return RowListtOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowListtOne1VH, position: Int) {
    val listtOne1RowModel = ListtOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val listtOne1RowModel = list[position]
    holder.binding.listtOne1RowModel = listtOne1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtOne1RowModel>) {
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
      item: ListtOne1RowModel
    ) {
    }
  }

  inner class RowListtOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtOne1Binding = RowListtOne1Binding.bind(itemView)
  }
}
