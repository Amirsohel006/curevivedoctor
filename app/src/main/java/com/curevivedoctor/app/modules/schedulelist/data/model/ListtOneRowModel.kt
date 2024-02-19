package com.curevivedoctor.app.modules.schedulelist.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListtOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtF: String? = MyApp.getInstance().resources.getString(R.string.lbl_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)

)
