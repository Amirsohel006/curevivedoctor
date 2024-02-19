package com.curevivedoctor.app.modules.dietprotocol.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListentermealRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEntermeal: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_meal)

)
