package com.curevivedoctor.app.modules.supervisorHomeFragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.home.data.viewmodel.HomeVM
import com.curevivedoctor.app.modules.home.ui.Listellipse543Adapter
import com.curevivedoctor.app.modules.home.ui.ListmarkspenceAdapter
import com.curevivedoctor.app.modules.home.ui.ListpatientsAdapter
import com.curevivedoctor.app.modules.homefragment.recyclerView2
import com.curevivedoctor.app.modules.recentdoctors.RecentDoctors
import com.curevivedoctor.app.modules.recentqueries.RecentQueries
import com.curevivedoctor.app.modules.viewall.viewallactivity

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


private lateinit var recyclerView: RecyclerView
private lateinit var recyclerView1: RecyclerView
private lateinit var recyclerView2: RecyclerView
private lateinit var recyclerView3: RecyclerView
class SuperVisorHomeFragmen : Fragment() {

    private val viewModel: HomeVM by viewModels<HomeVM>()

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_super_visor_home, container, false).apply {
            recyclerView =findViewById(R.id.recyclerListmarkspence)
            recyclerView1 =findViewById(R.id.recyclerListmarkspence1)
            recyclerView2 =findViewById(R.id.recyclerListellipse543)


            recyclerView3=findViewById(R.id.recyclerListmarkspence11)

            val listmarkspenceAdapter =
                ListmarkspenceAdapter(viewModel.listmarkspenceList.value?:mutableListOf())
            recyclerView.adapter = listmarkspenceAdapter

            viewModel.listmarkspenceList.observe(requireActivity()) {
                listmarkspenceAdapter.updateData(it)
            }


            val listmarkspenceAdapter1 =
                ListmarkspenceAdapter(viewModel.listmarkspenceList.value?:mutableListOf())
            recyclerView1.adapter = listmarkspenceAdapter

            viewModel.listmarkspenceList.observe(requireActivity()) {
                listmarkspenceAdapter1.updateData(it)
            }


            val listmarkspenceAdapter11 =
                ListmarkspenceAdapter(viewModel.listmarkspenceList.value?:mutableListOf())
            recyclerView3.adapter = listmarkspenceAdapter

            viewModel.listmarkspenceList.observe(requireActivity()) {
                listmarkspenceAdapter11.updateData(it)
            }





            val listellipse543Adapter =
                Listellipse543Adapter(viewModel.listellipse543List.value?:mutableListOf())
            recyclerView2.adapter = listellipse543Adapter
//            listellipse543Adapter.setOnItemClickListener(
//                object : Listellipse543Adapter.OnItemClickListener {
//                    override fun onItemClick(view:View, position:Int, item : Listellipse543RowModel) {
//                        onClickRecyclerListellipse543(view, position, item)
//                    }
//                }
//            )
            viewModel.listellipse543List.observe(requireActivity()) {
                listellipse543Adapter.updateData(it)
            }


            val linearLayout1:LinearLayout=findViewById(R.id.linearRowviewall1)
            linearLayout1.setOnClickListener {
                val i=Intent(requireActivity(),viewallactivity::class.java)
                startActivity(i)
            }


            val  linearLayout: LinearLayout =findViewById(R.id.linearRowviewall)
            linearLayout.setOnClickListener {
                val i= Intent(requireActivity(), RecentQueries::class.java)
                startActivity(i)
            }


            val linearLayout2:LinearLayout=findViewById(R.id.linearRowviewallOne)
            linearLayout2.setOnClickListener {
                val i=Intent(requireActivity(),RecentDoctors::class.java)
                startActivity(i)
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SuperVisorHomeFragmen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SuperVisorHomeFragmen().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}