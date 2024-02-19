package com.curevivedoctor.app.modules.profileprice.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class Listgroup100000218ThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000218Three: String? = MyApp.getInstance().resources.getString(R.string.lbl_asthma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000218One: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bronchitis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100000219One: String? = MyApp.getInstance().resources.getString(R.string.lbl_thyroid)

)
