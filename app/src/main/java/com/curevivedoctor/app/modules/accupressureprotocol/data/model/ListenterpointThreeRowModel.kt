package com.curevivedoctor.app.modules.accupressureprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListenterpointThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterpointThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_point)

)
