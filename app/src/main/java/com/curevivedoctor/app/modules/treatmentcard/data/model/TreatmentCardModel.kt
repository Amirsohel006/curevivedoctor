package com.curevivedoctor.app.modules.treatmentcard.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class TreatmentCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTreatmentCard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_treatment_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_case_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.msg_treatment_refer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoga: String? = MyApp.getInstance().resources.getString(R.string.lbl_yoga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiet: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHerbology: String? = MyApp.getInstance().resources.getString(R.string.lbl_herbology)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAromaTherapy: String? = MyApp.getInstance().resources.getString(R.string.lbl_aroma_therapy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHydrotherapy: String? = MyApp.getInstance().resources.getString(R.string.lbl_hydrotherapy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccupressure: String? = MyApp.getInstance().resources.getString(R.string.lbl_accupressure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup4481Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup4482Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup4483Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSevenValue: String? = null
)
