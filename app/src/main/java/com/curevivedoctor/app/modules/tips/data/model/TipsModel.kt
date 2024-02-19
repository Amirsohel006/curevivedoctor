package com.curevivedoctor.app.modules.tips.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class TipsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTIPS: String? = MyApp.getInstance().resources.getString(R.string.lbl_tips)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtREPEAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_repeat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTipCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_tip_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWritehere: String? = MyApp.getInstance().resources.getString(R.string.lbl_write_here2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
