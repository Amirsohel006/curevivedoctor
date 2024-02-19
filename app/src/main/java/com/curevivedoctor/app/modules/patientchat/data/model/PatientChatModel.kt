package com.curevivedoctor.app.modules.patientchat.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class PatientChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHearlyQuin: String? = MyApp.getInstance().resources.getString(R.string.lbl_hearly_quin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnline: String? = MyApp.getInstance().resources.getString(R.string.lbl_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_mike_mazowski)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_guys_we)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1604: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_04)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThatsverynic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_that_s_very_nic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1604One: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_04)

)
