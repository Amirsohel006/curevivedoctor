package com.curevivedoctor.app.modules.profilebarcode.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileBarCodeModel(
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
  var txtMyCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyLink: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_link)

)
