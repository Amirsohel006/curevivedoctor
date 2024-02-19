package com.curevivedoctor.app.modules.assetgenerated.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class AssetGeneratedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_income2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt45990: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_599_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt29July0000: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_july_00_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt22034276: String? = MyApp.getInstance().resources.getString(R.string.lbl_220_342_76)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_1000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)

)
