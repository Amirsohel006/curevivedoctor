package com.curevivedoctor.app.modules.profiletimeone.ui

import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityProfileTimeOneBinding
import com.curevivedoctor.app.modules.profilebarcode.ui.ProfileBarCodeActivity
import com.curevivedoctor.app.modules.profileinfo.ui.ProfileInfoActivity
import com.curevivedoctor.app.modules.profileprice.ui.ProfilePriceActivity
import com.curevivedoctor.app.modules.profiletimeone.`data`.model.ListtimeTwo1RowModel
import com.curevivedoctor.app.modules.profiletimeone.`data`.viewmodel.ProfileTimeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileTimeOneActivity :
    BaseActivity<ActivityProfileTimeOneBinding>(R.layout.activity_profile_time_one) {
  private val viewModel: ProfileTimeOneVM by viewModels<ProfileTimeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtimeTwoAdapter =
    ListtimeTwoAdapter(viewModel.listtimeTwoList.value?:mutableListOf())
    binding.recyclerListtimeTwo.adapter = listtimeTwoAdapter
    listtimeTwoAdapter.setOnItemClickListener(
    object : ListtimeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeTwo1RowModel) {
        onClickRecyclerListtimeTwo(view, position, item)
      }
    }
    )
    viewModel.listtimeTwoList.observe(this) {
      listtimeTwoAdapter.updateData(it)
    }
    binding.profileTimeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsearch.setOnClickListener {
      val destIntent = ProfileBarCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnmobile.setOnClickListener {
      val destIntent = ProfileInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnsort.setOnClickListener {
      val destIntent = ProfilePriceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListtimeTwo(
    view: View,
    position: Int,
    item: ListtimeTwo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_TIME_ONE_ACTIVITY"

  }
}
