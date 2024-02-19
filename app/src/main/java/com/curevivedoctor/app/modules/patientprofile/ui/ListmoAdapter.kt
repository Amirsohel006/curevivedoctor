package com.curevivedoctor.app.modules.patientprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListmo1Binding
import com.curevivedoctor.app.modules.patientprofile.`data`.model.Listmo1RowModel
import kotlin.Int
import kotlin.collections.List

class ListmoAdapter(
  var list: List<Listmo1RowModel>
) : RecyclerView.Adapter<ListmoAdapter.RowListmo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmo1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmo1,parent,false)
    return RowListmo1VH(view)
  }

  override fun onBindViewHolder(holder: RowListmo1VH, position: Int) {
    val listmo1RowModel = Listmo1RowModel()
    // TODO uncomment following line after integration with data source
    // val listmo1RowModel = list[position]
    holder.binding.listmo1RowModel = listmo1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmo1RowModel>) {
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
      item: Listmo1RowModel
    ) {
    }
  }

  inner class RowListmo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmo1Binding = RowListmo1Binding.bind(itemView)
  }
}
