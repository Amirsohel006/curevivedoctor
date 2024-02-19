package com.curevivedoctor.app.modules.patientchatcontainer.ui

import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityPatientChatContainerBinding
import com.curevivedoctor.app.extensions.loadFragment
import com.curevivedoctor.app.modules.patientchat.ui.PatientChatFragment
import com.curevivedoctor.app.modules.patientchatcontainer.`data`.viewmodel.PatientChatContainerVM
import kotlin.String
import kotlin.Unit

class PatientChatContainerActivity :
    BaseActivity<ActivityPatientChatContainerBinding>(R.layout.activity_patient_chat_container) {
  private val viewModel: PatientChatContainerVM by viewModels<PatientChatContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.patientChatContainerVM = viewModel
    val destFragment = PatientChatFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = PatientChatFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearRowsettings.setOnClickListener {
      val destFragment = PatientChatFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = PatientChatFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "PATIENT_CHAT_CONTAINER_ACTIVITY"

  }
}
