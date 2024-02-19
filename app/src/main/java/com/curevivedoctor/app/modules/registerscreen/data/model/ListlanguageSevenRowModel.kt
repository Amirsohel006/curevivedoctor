package com.curevivedoctor.app.modules.registerscreen.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageSevenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qualification_p2)

)
