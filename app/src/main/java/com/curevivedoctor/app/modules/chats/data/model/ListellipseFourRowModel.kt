package com.curevivedoctor.app.modules.chats.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipseFourRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSupervisorCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_supervisor_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1831One: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_31)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlstakealookOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pls_take_a_look)

)
