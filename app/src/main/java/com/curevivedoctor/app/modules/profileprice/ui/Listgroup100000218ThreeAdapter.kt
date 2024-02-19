package com.curevivedoctor.app.modules.profileprice.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListgroup100000218ThreeBinding
import com.curevivedoctor.app.modules.profileprice.`data`.model.Listgroup100000218ThreeRowModel
import kotlin.Int
import kotlin.collections.List

class Listgroup100000218ThreeAdapter(
  var list: List<Listgroup100000218ThreeRowModel>
) : RecyclerView.Adapter<Listgroup100000218ThreeAdapter.RowListgroup100000218ThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroup100000218ThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup100000218_three,parent,false)
    return RowListgroup100000218ThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroup100000218ThreeVH, position: Int) {
    val listgroup100000218ThreeRowModel = Listgroup100000218ThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroup100000218ThreeRowModel = list[position]
    holder.binding.listgroup100000218ThreeRowModel = listgroup100000218ThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroup100000218ThreeRowModel>) {
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
      item: Listgroup100000218ThreeRowModel
    ) {
    }
  }

  inner class RowListgroup100000218ThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroup100000218ThreeBinding =
        RowListgroup100000218ThreeBinding.bind(itemView)
  }
}
