package com.curevivedoctor.app.modules.home.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class Listellipse543RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAsitDessai: String? = MyApp.getInstance().resources.getString(R.string.lbl_asit_dessai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiabetesOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_diabetes)

)
