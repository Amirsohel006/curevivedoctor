package com.curevivedoctor.app.modules.patientprofile.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class Listmo1RowModel(
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
