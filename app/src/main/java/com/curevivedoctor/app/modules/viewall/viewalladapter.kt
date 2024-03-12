package com.curevivedoctor.app.modules.viewall

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.home.data.model.ListmarkspenceRowModel
import com.curevivedoctor.app.modules.rakihome.RekiAdapter

class viewalladapter(
    var list: List<ListmarkspenceRowModel>
) : RecyclerView.Adapter<viewalladapter.RowListmarkspenceVH>() {
    private var clickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewalladapter.RowListmarkspenceVH {
        val view=
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_view_all_list,parent,false)
        return RowListmarkspenceVH(view)
    }

    override fun onBindViewHolder(holder: RowListmarkspenceVH, position: Int) {
        val listmarkspenceRowModel = ListmarkspenceRowModel()
        // holder.binding.listmarkspenceRowModel = listmarkspenceRowModel
    }




    override fun getItemCount(): Int = 4

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
        // val binding: RowListmarkspenceBinding = RowListmarkspenceBinding.bind(itemView)
    }
}
