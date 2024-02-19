package com.curevivedoctor.app.modules.settings.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVersionCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_version_1_2)

)
