package com.curevivedoctor.app.modules.querypopup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityQueryPopUpBinding
import com.curevivedoctor.app.modules.querypopup.`data`.viewmodel.QueryPopUpVM
import kotlin.String
import kotlin.Unit

class QueryPopUpActivity : BaseActivity<ActivityQueryPopUpBinding>(R.layout.activity_query_pop_up) {
  private val viewModel: QueryPopUpVM by viewModels<QueryPopUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.queryPopUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "QUERY_POP_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QueryPopUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
