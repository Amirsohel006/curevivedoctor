package com.curevivedoctor.app.modules.patientfile.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class PatientFileModel(
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_city_banglore)

)
