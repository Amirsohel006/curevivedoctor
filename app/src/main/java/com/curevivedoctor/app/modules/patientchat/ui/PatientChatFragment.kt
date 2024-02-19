package com.curevivedoctor.app.modules.patientchat.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseFragment
import com.curevivedoctor.app.databinding.FragmentPatientChatBinding
import com.curevivedoctor.app.modules.patientchat.`data`.viewmodel.PatientChatVM
import kotlin.String
import kotlin.Unit

class PatientChatFragment : BaseFragment<FragmentPatientChatBinding>(R.layout.fragment_patient_chat)
    {
  private val viewModel: PatientChatVM by viewModels<PatientChatVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.patientChatVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "PATIENT_CHAT_FRAGMENT"


    fun getInstance(bundle: Bundle?): PatientChatFragment {
      val fragment = PatientChatFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
