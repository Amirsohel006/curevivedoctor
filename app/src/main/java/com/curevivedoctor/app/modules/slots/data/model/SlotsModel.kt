package com.curevivedoctor.app.modules.slots.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class SlotsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSlots: String? = MyApp.getInstance().resources.getString(R.string.lbl_slots)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000217: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000217One: String? = MyApp.getInstance().resources.getString(R.string.lbl_tue2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000217Two: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000217Three: String? = MyApp.getInstance().resources.getString(R.string.lbl_thu2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000217Four: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000217Five: String? = MyApp.getInstance().resources.getString(R.string.lbl_sat2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSUN: String? = MyApp.getInstance().resources.getString(R.string.lbl_sun2)

)
