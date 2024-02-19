package com.curevivedoctor.app.modules.profiletime.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityProfileTimeBinding
import com.curevivedoctor.app.modules.profilebarcode.ui.ProfileBarCodeActivity
import com.curevivedoctor.app.modules.profileinfo.ui.ProfileInfoActivity
import com.curevivedoctor.app.modules.profileprice.ui.ProfilePriceActivity
import com.curevivedoctor.app.modules.profiletime.`data`.model.ListtimeTwoRowModel
import com.curevivedoctor.app.modules.profiletime.`data`.viewmodel.ProfileTimeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileTimeActivity : BaseActivity<ActivityProfileTimeBinding>(R.layout.activity_profile_time)
    {
  private val viewModel: ProfileTimeVM by viewModels<ProfileTimeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtimeTwoAdapter =
    ListtimeTwoAdapter(viewModel.listtimeTwoList.value?:mutableListOf())
    binding.recyclerListtimeTwo.adapter = listtimeTwoAdapter
    listtimeTwoAdapter.setOnItemClickListener(
    object : ListtimeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeTwoRowModel) {
        onClickRecyclerListtimeTwo(view, position, item)
      }
    }
    )
    viewModel.listtimeTwoList.observe(this) {
      listtimeTwoAdapter.updateData(it)
    }
    binding.profileTimeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsort.setOnClickListener {
      val destIntent = ProfilePriceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnsearch.setOnClickListener {
      val destIntent = ProfileBarCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnmobile.setOnClickListener {
      val destIntent = ProfileInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListtimeTwo(
    view: View,
    position: Int,
    item: ListtimeTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_TIME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileTimeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
