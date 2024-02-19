package com.curevivedoctor.app.modules.frametwentynine.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class FrameTwentynineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSlotsUpdatedS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_slots_updated_s)

)
