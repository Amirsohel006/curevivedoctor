package com.curevivedoctor.app.modules.welcomescreensfive.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreensFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName31Gr: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName31Gro: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAge31Group421: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup199: String? = MyApp.getInstance().resources.getString(R.string.lbl_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalDetailsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt131Group10000: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt231Group10000: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt331Group10000: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender31Group: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup197Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup198Value: String? = null
)
