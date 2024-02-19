package com.curevivedoctor.app.modules.loginscreen.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class LoginScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGobacktom: String? = MyApp.getInstance().resources.getString(R.string.msg_go_back_to_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup145Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup146Value: String? = null
)
