package com.curevivedoctor.app.modules.accupressureprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListenterpointRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterpoint: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_point)

)
