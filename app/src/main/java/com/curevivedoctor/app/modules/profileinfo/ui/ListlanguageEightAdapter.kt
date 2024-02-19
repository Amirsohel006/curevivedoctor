package com.curevivedoctor.app.modules.profileinfo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListlanguageEightBinding
import com.curevivedoctor.app.modules.profileinfo.`data`.model.ListlanguageEightRowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageEightAdapter(
  var list: List<ListlanguageEightRowModel>
) : RecyclerView.Adapter<ListlanguageEightAdapter.RowListlanguageEightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguageEightVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage_eight,parent,false)
    return RowListlanguageEightVH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguageEightVH, position: Int) {
    val listlanguageEightRowModel = ListlanguageEightRowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguageEightRowModel = list[position]
    holder.binding.listlanguageEightRowModel = listlanguageEightRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlanguageEightRowModel>) {
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
      item: ListlanguageEightRowModel
    ) {
    }
  }

  inner class RowListlanguageEightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguageEightBinding = RowListlanguageEightBinding.bind(itemView)
  }
}
