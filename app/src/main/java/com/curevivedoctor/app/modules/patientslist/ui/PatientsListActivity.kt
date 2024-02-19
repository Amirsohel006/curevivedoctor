package com.curevivedoctor.app.modules.patientslist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityPatientsListBinding
import com.curevivedoctor.app.modules.patientslist.`data`.model.PatientsListRowModel
import com.curevivedoctor.app.modules.patientslist.`data`.viewmodel.PatientsListVM
import com.curevivedoctor.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PatientsListActivity :
    BaseActivity<ActivityPatientsListBinding>(R.layout.activity_patients_list) {
  private val viewModel: PatientsListVM by viewModels<PatientsListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val patientsListAdapter =
    PatientsListAdapter(viewModel.patientsListList.value?:mutableListOf())
    binding.recyclerPatientsList.adapter = patientsListAdapter
    patientsListAdapter.setOnItemClickListener(
    object : PatientsListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PatientsListRowModel) {
        onClickRecyclerPatientsList(view, position, item)
      }
    }
    )
    viewModel.patientsListList.observe(this) {
      patientsListAdapter.updateData(it)
    }
    binding.patientsListVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPatientsList(
    view: View,
    position: Int,
    item: PatientsListRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PATIENTS_LIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PatientsListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
