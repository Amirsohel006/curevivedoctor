package com.curevivedoctor.app.modules.registerscreenone.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterScreenOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQualificationD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qualification_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQualification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_qualification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExperience: String? = MyApp.getInstance().resources.getString(R.string.lbl_experience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup128: String? = MyApp.getInstance().resources.getString(R.string.lbl_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQualificationP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qualification_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEducation: String? = MyApp.getInstance().resources.getString(R.string.lbl_education)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExperienceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_experience2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdentityProof: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_identity_proof)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_id_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup127Value: String? = null
)
