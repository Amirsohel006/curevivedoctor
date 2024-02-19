package com.curevivedoctor.app.modules.dietprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class DietProtocolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDIET: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtREPEAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_repeat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_input_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMealCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_meal_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMealCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_meal_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMealCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_meal_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddmeal: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_meal)

)
