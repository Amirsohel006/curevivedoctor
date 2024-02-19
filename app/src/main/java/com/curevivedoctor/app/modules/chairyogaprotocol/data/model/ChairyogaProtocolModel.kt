package com.curevivedoctor.app.modules.chairyogaprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ChairyogaProtocolModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCHAIRYOGA: String? = MyApp.getInstance().resources.getString(R.string.lbl_chairyoga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtREPEAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_repeat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_follow_the_prov)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterAsana: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_asana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPranayama: String? = MyApp.getInstance().resources.getString(R.string.lbl_pranayama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_pranayama_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPranayamaCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pranayama_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStandingtosit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_standing_to_sit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPranayamaCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pranayama_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelaxation: String? = MyApp.getInstance().resources.getString(R.string.lbl_relaxation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_d_r_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_duration_30_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
