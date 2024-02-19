package com.curevivedoctor.app.modules.aromaprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class AromaProtocolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAROMA: String? = MyApp.getInstance().resources.getString(R.string.lbl_aroma)
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
