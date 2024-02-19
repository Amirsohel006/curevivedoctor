package com.curevivedoctor.app.modules.vitaldiabities.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListtOne2Binding
import com.curevivedoctor.app.modules.vitaldiabities.`data`.model.ListtOne2RowModel
import kotlin.Int
import kotlin.collections.List

class ListtOneAdapter(
  var list: List<ListtOne2RowModel>
) : RecyclerView.Adapter<ListtOneAdapter.RowListtOne2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtOne2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listt_one2,parent,false)
    return RowListtOne2VH(view)
  }

  override fun onBindViewHolder(holder: RowListtOne2VH, position: Int) {
    val listtOne2RowModel = ListtOne2RowModel()
    // TODO uncomment following line after integration with data source
    // val listtOne2RowModel = list[position]
    holder.binding.listtOne2RowModel = listtOne2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtOne2RowModel>) {
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
      item: ListtOne2RowModel
    ) {
    }
  }

  inner class RowListtOne2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtOne2Binding = RowListtOne2Binding.bind(itemView)
  }
}
