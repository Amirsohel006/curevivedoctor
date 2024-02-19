package com.curevivedoctor.app.modules.patientprofileone.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListmoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMo: String? = MyApp.getInstance().resources.getString(R.string.lbl_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeHundredThirtyFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_33_5)

)
