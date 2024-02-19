package com.curevivedoctor.app.modules.settings.ui

import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivitySettingsBinding
import com.curevivedoctor.app.modules.querypopup.ui.QueryPopUpActivity
import com.curevivedoctor.app.modules.settings.`data`.model.SettingsRowModel
import com.curevivedoctor.app.modules.settings.`data`.viewmodel.SettingsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val settingsAdapter = SettingsAdapter(viewModel.settingsList.value?:mutableListOf())
    binding.recyclerSettings.adapter = settingsAdapter
    settingsAdapter.setOnItemClickListener(
    object : SettingsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SettingsRowModel) {
        onClickRecyclerSettings(view, position, item)
      }
    }
    )
    viewModel.settingsList.observe(this) {
      settingsAdapter.updateData(it)
    }
    binding.settingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = QueryPopUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSettings(
    view: View,
    position: Int,
    item: SettingsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_ACTIVITY"

  }
}
