package com.curevivedoctor.app.modules.querypopup.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class QueryPopUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourquer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_quer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWritehere: String? = MyApp.getInstance().resources.getString(R.string.lbl_write_here)

)
