package com.curevivedoctor.app.modules.wallettransactions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListgroup100000197Binding
import com.curevivedoctor.app.modules.wallettransactions.`data`.model.Listgroup100000197RowModel
import kotlin.Int
import kotlin.collections.List

class Listgroup100000197Adapter(
  var list: List<Listgroup100000197RowModel>
) : RecyclerView.Adapter<Listgroup100000197Adapter.RowListgroup100000197VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroup100000197VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup100000197,parent,false)
    return RowListgroup100000197VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroup100000197VH, position: Int) {
    val listgroup100000197RowModel = Listgroup100000197RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroup100000197RowModel = list[position]
    holder.binding.listgroup100000197RowModel = listgroup100000197RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroup100000197RowModel>) {
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
      item: Listgroup100000197RowModel
    ) {
    }
  }

  inner class RowListgroup100000197VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroup100000197Binding = RowListgroup100000197Binding.bind(itemView)
  }
}
