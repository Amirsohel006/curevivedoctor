package com.curevivedoctor.app.modules.home.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListpatientsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPatients: String? = MyApp.getInstance().resources.getString(R.string.lbl_patients)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContainer: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_4)

)
