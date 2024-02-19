package com.curevivedoctor.app.modules.accupressureprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class AccupressureProtocolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_accupressure2)
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
      MyApp.getInstance().resources.getString(R.string.msg_kindly_make_sur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcupressurepoi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_acupressure_poi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFootreflexolog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_foot_reflexolog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandreflexolog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hand_reflexolog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
