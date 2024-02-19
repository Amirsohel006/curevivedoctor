package com.curevivedoctor.app.modules.patientslist.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class PatientsListModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPatients: String? = MyApp.getInstance().resources.getString(R.string.lbl_patients)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParty: String? = MyApp.getInstance().resources.getString(R.string.lbl_hyperlipidemia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup4070Value: String? = null
)
