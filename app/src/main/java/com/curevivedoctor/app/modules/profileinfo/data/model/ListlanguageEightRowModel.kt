package com.curevivedoctor.app.modules.profileinfo.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageEightRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageEight: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qualification_p2)

)
