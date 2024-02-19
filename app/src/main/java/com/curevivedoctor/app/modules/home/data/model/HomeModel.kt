package com.curevivedoctor.app.modules.home.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrRayanShaik: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dr_rayan_shaik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNaturopathyDoc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_naturopathy_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchforPati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_for_pati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourschedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPatientVitals: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_patient_vitals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiabetes: String? = MyApp.getInstance().resources.getString(R.string.lbl_diabetes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHypertension: String? = MyApp.getInstance().resources.getString(R.string.lbl_hypertension)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentPatients: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_patients)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalincome: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_income)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt49990: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_999_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_you_gained_42)

)
