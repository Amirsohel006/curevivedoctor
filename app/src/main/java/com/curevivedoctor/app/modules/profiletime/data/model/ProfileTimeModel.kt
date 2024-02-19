package com.curevivedoctor.app.modules.profiletime.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileTimeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrRayanShaik: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dr_rayan_shaik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_patients2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightHundredFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_845)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRating562: String? = MyApp.getInstance().resources.getString(R.string.lbl_rating_562)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_when_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame3660: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame3661: String? = MyApp.getInstance().resources.getString(R.string.lbl_tue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame3662: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame3663: String? = MyApp.getInstance().resources.getString(R.string.lbl_thu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame3664: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame3665: String? = MyApp.getInstance().resources.getString(R.string.lbl_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame3666: String? = MyApp.getInstance().resources.getString(R.string.lbl_sun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetTimings: String? = MyApp.getInstance().resources.getString(R.string.lbl_set_timings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_7_00am_8_00_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOff: String? = MyApp.getInstance().resources.getString(R.string.lbl_off)

)
