package com.curevivedoctor.app.modules.registerscreentwo.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterScreenTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailID: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtState: String? = MyApp.getInstance().resources.getString(R.string.lbl_state)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle6400Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle6400OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup134Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup133Value: String? = null
)
