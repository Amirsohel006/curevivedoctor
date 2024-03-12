package com.curevivedoctor.app.modules.walletfragmentforeki

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.walletinfo.WalletInfo


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class WalletFragmentForReki : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wallet_for_reki, container, false)

        // Change status bar color for this fragment
        activity?.window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.statusbarwalle)

        val linearLayout:LinearLayout=view.findViewById(R.id.linearRowprice)
        linearLayout.setOnClickListener {
            val i=Intent(requireActivity(),WalletInfo::class.java)
            startActivity(i)
        }
        return view
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WalletFragmentForReki().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}