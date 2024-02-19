package com.curevivedoctor.app.modules.patientslist.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class PatientsListRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPriya: String? = MyApp.getInstance().resources.getString(R.string.lbl_priya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_female_26_yrs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHypertension: String? = MyApp.getInstance().resources.getString(R.string.lbl_hypertension)

)
