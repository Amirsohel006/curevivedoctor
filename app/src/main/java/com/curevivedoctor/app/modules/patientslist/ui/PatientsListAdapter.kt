package com.curevivedoctor.app.modules.patientslist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.databinding.RowPatientsListBinding
import com.curevivedoctor.app.modules.patientslist.`data`.model.PatientsListRowModel
import kotlin.Int
import kotlin.collections.List

class PatientsListAdapter(
  var list: List<PatientsListRowModel>
) : RecyclerView.Adapter<PatientsListAdapter.RowPatientsListVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPatientsListVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_patients_list,parent,false)
    return RowPatientsListVH(view)
  }

  override fun onBindViewHolder(holder: RowPatientsListVH, position: Int) {
    val patientsListRowModel = PatientsListRowModel()
    // TODO uncomment following line after integration with data source
    // val patientsListRowModel = list[position]
    holder.binding.patientsListRowModel = patientsListRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PatientsListRowModel>) {
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
      item: PatientsListRowModel
    ) {
    }
  }

  inner class RowPatientsListVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPatientsListBinding = RowPatientsListBinding.bind(itemView)
  }
}
