package com.curevivedoctor.app.modules.chats.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChats: String? = MyApp.getInstance().resources.getString(R.string.lbl_chats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParty: String? = MyApp.getInstance().resources.getString(R.string.lbl_hyperlipidemia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRonaldMccoy: String? = MyApp.getInstance().resources.getString(R.string.lbl_ronald_mccoy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterday: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThanksdude: String? = MyApp.getInstance().resources.getString(R.string.lbl_thanks_dude)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbertBell: String? = MyApp.getInstance().resources.getString(R.string.lbl_albert_bell)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterdayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImhappythis: String? = MyApp.getInstance().resources.getString(R.string.msg_i_m_happy_this)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRonaldMccoyOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ronald_mccoy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSFSymbol: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterdayTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThanksdudeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_thanks_dude)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbertBellOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_albert_bell)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterdayThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImhappythisOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_m_happy_this)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup4070Value: String? = null
)
