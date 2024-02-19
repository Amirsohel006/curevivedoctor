package com.curevivedoctor.app.modules.patientprofileone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListmoBinding
import com.curevivedoctor.app.modules.patientprofileone.`data`.model.ListmoRowModel
import kotlin.Int
import kotlin.collections.List

class ListmoAdapter(
  var list: List<ListmoRowModel>
) : RecyclerView.Adapter<ListmoAdapter.RowListmoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmo,parent,false)
    return RowListmoVH(view)
  }

  override fun onBindViewHolder(holder: RowListmoVH, position: Int) {
    val listmoRowModel = ListmoRowModel()
    // TODO uncomment following line after integration with data source
    // val listmoRowModel = list[position]
    holder.binding.listmoRowModel = listmoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmoRowModel>) {
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
      item: ListmoRowModel
    ) {
    }
  }

  inner class RowListmoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmoBinding = RowListmoBinding.bind(itemView)
  }
}
