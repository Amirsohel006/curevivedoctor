package com.curevivedoctor.app.modules.profileprice.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ProfilePriceModel(
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
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_choose_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLowprices: String? = MyApp.getInstance().resources.getString(R.string.lbl_still_confused)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_disease)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.msg_see_prices_fixe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000219: String? = MyApp.getInstance().resources.getString(R.string.lbl_diabetes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000218: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hypertension)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZeroOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_diabetes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_4500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_10000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_6800)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZeroTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_platform_fees)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZeroThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_profit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2300)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup100000218OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup100000218TwoValue: String? = null
)
