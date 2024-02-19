package com.curevivedoctor.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListmarkspenceBinding
import com.curevivedoctor.app.modules.home.`data`.model.ListmarkspenceRowModel
import kotlin.Int
import kotlin.collections.List

class ListmarkspenceAdapter(
  var list: List<ListmarkspenceRowModel>
) : RecyclerView.Adapter<ListmarkspenceAdapter.RowListmarkspenceVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmarkspenceVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmarkspence,parent,false)
    return RowListmarkspenceVH(view)
  }

  override fun onBindViewHolder(holder: RowListmarkspenceVH, position: Int) {
    val listmarkspenceRowModel = ListmarkspenceRowModel()
    // TODO uncomment following line after integration with data source
    // val listmarkspenceRowModel = list[position]
    holder.binding.listmarkspenceRowModel = listmarkspenceRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmarkspenceRowModel>) {
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
      item: ListmarkspenceRowModel
    ) {
    }
  }

  inner class RowListmarkspenceVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmarkspenceBinding = RowListmarkspenceBinding.bind(itemView)
  }
}
