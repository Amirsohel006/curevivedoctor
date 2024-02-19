package com.curevivedoctor.app.modules.search.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class SearchRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShakti: String? = MyApp.getInstance().resources.getString(R.string.lbl_shakti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_male_26_yrs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHypertension: String? = MyApp.getInstance().resources.getString(R.string.lbl_hypertension)

)
