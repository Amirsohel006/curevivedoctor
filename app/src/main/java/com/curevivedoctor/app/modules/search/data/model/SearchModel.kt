package com.curevivedoctor.app.modules.search.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiseaseFilter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_disease_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParty: String? = MyApp.getInstance().resources.getString(R.string.lbl_hyperlipidemia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPartyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_osteoarthritis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentSearchs: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_search_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup4308Value: String? = null
)
