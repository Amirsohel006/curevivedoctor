package com.curevivedoctor.app.modules.profiletime.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListtimeTwoBinding
import com.curevivedoctor.app.modules.profiletime.`data`.model.ListtimeTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListtimeTwoAdapter(
  var list: List<ListtimeTwoRowModel>
) : RecyclerView.Adapter<ListtimeTwoAdapter.RowListtimeTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtimeTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtime_two,parent,false)
    return RowListtimeTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListtimeTwoVH, position: Int) {
    val listtimeTwoRowModel = ListtimeTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listtimeTwoRowModel = list[position]
    holder.binding.listtimeTwoRowModel = listtimeTwoRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtimeTwoRowModel>) {
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
      item: ListtimeTwoRowModel
    ) {
    }
  }

  inner class RowListtimeTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtimeTwoBinding = RowListtimeTwoBinding.bind(itemView)
  }
}
