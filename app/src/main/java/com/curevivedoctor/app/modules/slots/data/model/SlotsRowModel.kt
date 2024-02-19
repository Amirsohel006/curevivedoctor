package com.curevivedoctor.app.modules.slots.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class SlotsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_7_00am_8_00_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOff: String? = MyApp.getInstance().resources.getString(R.string.lbl_off)

)
