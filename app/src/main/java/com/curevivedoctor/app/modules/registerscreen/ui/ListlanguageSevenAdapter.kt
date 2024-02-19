package com.curevivedoctor.app.modules.registerscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowListlanguageSevenBinding
import com.curevivedoctor.app.modules.registerscreen.`data`.model.ListlanguageSevenRowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageSevenAdapter(
  var list: List<ListlanguageSevenRowModel>
) : RecyclerView.Adapter<ListlanguageSevenAdapter.RowListlanguageSevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguageSevenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage_seven,parent,false)
    return RowListlanguageSevenVH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguageSevenVH, position: Int) {
    val listlanguageSevenRowModel = ListlanguageSevenRowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguageSevenRowModel = list[position]
    holder.binding.listlanguageSevenRowModel = listlanguageSevenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlanguageSevenRowModel>) {
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
      item: ListlanguageSevenRowModel
    ) {
    }
  }

  inner class RowListlanguageSevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguageSevenBinding = RowListlanguageSevenBinding.bind(itemView)
  }
}
