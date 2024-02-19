package com.curevivedoctor.app.modules.patientchatcontainer.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class PatientChatContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteamessage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_a_message)

)
