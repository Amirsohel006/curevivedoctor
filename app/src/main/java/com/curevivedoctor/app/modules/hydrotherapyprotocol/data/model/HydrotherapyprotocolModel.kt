package com.curevivedoctor.app.modules.hydrotherapyprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class HydrotherapyprotocolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHYDROTHERAPY: String? = MyApp.getInstance().resources.getString(R.string.lbl_hydrotherapy2)
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
  var txtChoosefromthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_from_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
