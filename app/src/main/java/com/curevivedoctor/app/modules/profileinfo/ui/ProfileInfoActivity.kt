package com.curevivedoctor.app.modules.profileinfo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityProfileInfoBinding
import com.curevivedoctor.app.modules.profilebarcode.ui.ProfileBarCodeActivity
import com.curevivedoctor.app.modules.profileinfo.`data`.model.ListlanguageEightRowModel
import com.curevivedoctor.app.modules.profileinfo.`data`.viewmodel.ProfileInfoVM
import com.curevivedoctor.app.modules.profileprice.ui.ProfilePriceActivity
import com.curevivedoctor.app.modules.profiletime.ui.ProfileTimeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileInfoActivity : BaseActivity<ActivityProfileInfoBinding>(R.layout.activity_profile_info)
    {
  private val viewModel: ProfileInfoVM by viewModels<ProfileInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlanguageEightAdapter =
    ListlanguageEightAdapter(viewModel.listlanguageEightList.value?:mutableListOf())
    binding.recyclerListlanguageEight.adapter = listlanguageEightAdapter
    listlanguageEightAdapter.setOnItemClickListener(
    object : ListlanguageEightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageEightRowModel) {
        onClickRecyclerListlanguageEight(view, position, item)
      }
    }
    )
    viewModel.listlanguageEightList.observe(this) {
      listlanguageEightAdapter.updateData(it)
    }
    binding.profileInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAction.setOnClickListener {
      val destIntent = ProfilePriceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAction2.setOnClickListener {
      val destIntent = ProfileBarCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAction1.setOnClickListener {
      val destIntent = ProfileTimeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlanguageEight(
    view: View,
    position: Int,
    item: ListlanguageEightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_INFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileInfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
