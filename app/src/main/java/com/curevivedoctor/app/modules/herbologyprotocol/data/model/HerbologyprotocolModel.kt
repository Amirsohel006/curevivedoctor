package com.curevivedoctor.app.modules.herbologyprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class HerbologyprotocolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHERBOLOGY: String? = MyApp.getInstance().resources.getString(R.string.lbl_herbology2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtREPEAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_repeat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_please_specify)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProcedure: String? = MyApp.getInstance().resources.getString(R.string.lbl_procedure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntertexthere: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_text_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
