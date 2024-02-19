package com.curevivedoctor.app.modules.frame3676.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class Frame3676Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrationSu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_registration_su)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWewillreview: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_will_review)

)
