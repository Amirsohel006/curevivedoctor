package com.curevivedoctor.app.modules.walletearnings.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListreleasedamountRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReleasedamount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_released_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_50000)

)
