package com.curevivedoctor.app.modules.patientfilenotes.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class PatientFileNotesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFile: String? = MyApp.getInstance().resources.getString(R.string.lbl_file)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoctorsnotes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_doctor_s_notes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWritehere: String? = MyApp.getInstance().resources.getString(R.string.lbl_write_here)

)
