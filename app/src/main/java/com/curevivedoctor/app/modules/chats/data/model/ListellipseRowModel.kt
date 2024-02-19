package com.curevivedoctor.app.modules.chats.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipseRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSupervisorCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_supervisor_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1831: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_31)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlstakealook: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pls_take_a_look)

)
