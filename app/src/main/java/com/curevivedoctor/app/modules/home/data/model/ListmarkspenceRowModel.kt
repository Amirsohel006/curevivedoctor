package com.curevivedoctor.app.modules.home.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListmarkspenceRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMarkSpence: String? = MyApp.getInstance().resources.getString(R.string.lbl_mark_spence)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.msg_male_25_diabe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_fill_treatment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_sunday_27_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_08_00am_10_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInProgress: String? = MyApp.getInstance().resources.getString(R.string.lbl_in_progress)

)
