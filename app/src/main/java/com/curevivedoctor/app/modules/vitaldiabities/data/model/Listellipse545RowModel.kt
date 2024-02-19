package com.curevivedoctor.app.modules.vitaldiabities.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class Listellipse545RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAbdulKhan: String? = MyApp.getInstance().resources.getString(R.string.lbl_abdul_khan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFBSPPBS: String? = MyApp.getInstance().resources.getString(R.string.lbl_fbs_ppbs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt94104: String? = MyApp.getInstance().resources.getString(R.string.lbl_94_104)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt82106: String? = MyApp.getInstance().resources.getString(R.string.lbl_82_106)

)
