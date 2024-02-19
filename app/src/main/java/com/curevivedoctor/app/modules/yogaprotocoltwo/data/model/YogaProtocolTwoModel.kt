package com.curevivedoctor.app.modules.yogaprotocoltwo.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class YogaProtocolTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYOGA: String? = MyApp.getInstance().resources.getString(R.string.lbl_yoga2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtREPEAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_repeat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmittheform: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_submit_the_form)

)
