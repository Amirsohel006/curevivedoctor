package com.curevivedoctor.app.modules.workshops.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class WorkshopsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_duration_7_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtW: String? = MyApp.getInstance().resources.getString(R.string.lbl_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChakraMeditati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_chakra_meditati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectChakra: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_chakra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROTOCOL: String? = MyApp.getInstance().resources.getString(R.string.lbl_protocol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROTOCOLOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_protocol)

)
