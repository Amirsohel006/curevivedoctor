package com.curevivedoctor.app.modules.homefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.home.data.model.Listellipse543RowModel
import com.curevivedoctor.app.modules.home.data.model.ListmarkspenceRowModel
import com.curevivedoctor.app.modules.home.data.model.ListpatientsRowModel
import com.curevivedoctor.app.modules.home.data.viewmodel.HomeVM
import com.curevivedoctor.app.modules.home.ui.Listellipse543Adapter
import com.curevivedoctor.app.modules.home.ui.ListmarkspenceAdapter
import com.curevivedoctor.app.modules.home.ui.ListpatientsAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


private lateinit var recyclerView: RecyclerView
private lateinit var recyclerView1: RecyclerView
lateinit var recyclerView2: RecyclerView
/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private val viewModel: HomeVM by viewModels<HomeVM>()
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false).apply {
            recyclerView=findViewById(R.id.recyclerListmarkspence)
            recyclerView1=findViewById(R.id.recyclerListellipse543)
            recyclerView2=findViewById(R.id.recyclerListpatients)


            val listmarkspenceAdapter =
                ListmarkspenceAdapter(viewModel.listmarkspenceList.value?:mutableListOf())
           recyclerView.adapter = listmarkspenceAdapter
//            listmarkspenceAdapter.setOnItemClickListener(
//                object : ListmarkspenceAdapter.OnItemClickListener {
//                    override fun onItemClick(view:View, position:Int, item : ListmarkspenceRowModel) {
//                        onClickRecyclerListmarkspence(view, position, item)
//                    }
//                }
//            )
            viewModel.listmarkspenceList.observe(requireActivity()) {
                listmarkspenceAdapter.updateData(it)
            }



            val listellipse543Adapter =
                Listellipse543Adapter(viewModel.listellipse543List.value?:mutableListOf())
            recyclerView1.adapter = listellipse543Adapter
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


            val listpatientsAdapter =
                ListpatientsAdapter(viewModel.listpatientsList.value?:mutableListOf())
            recyclerView2.adapter = listpatientsAdapter
//            listpatientsAdapter.setOnItemClickListener(
//                object : ListpatientsAdapter.OnItemClickListener {
//                    override fun onItemClick(view:View, position:Int, item : ListpatientsRowModel) {
//                        onClickRecyclerListpatients(view, position, item)
//                    }
//                }
//            )
            viewModel.listpatientsList.observe(requireActivity()) {
                listpatientsAdapter.updateData(it)
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
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}