package com.curevivedoctor.app.modules.workshops.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListwebinarRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWebinar: String? = MyApp.getInstance().resources.getString(R.string.lbl_webinar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_00_pm_7_45_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_join)

)
