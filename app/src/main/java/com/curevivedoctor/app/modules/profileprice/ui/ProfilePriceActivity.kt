package com.curevivedoctor.app.modules.profileprice.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityProfilePriceBinding
import com.curevivedoctor.app.modules.frame3659.ui.Frame3659Activity
import com.curevivedoctor.app.modules.profilebarcode.ui.ProfileBarCodeActivity
import com.curevivedoctor.app.modules.profileinfo.ui.ProfileInfoActivity
import com.curevivedoctor.app.modules.profileprice.`data`.model.Listgroup100000218ThreeRowModel
import com.curevivedoctor.app.modules.profileprice.`data`.viewmodel.ProfilePriceVM
import com.curevivedoctor.app.modules.profiletime.ui.ProfileTimeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfilePriceActivity :
    BaseActivity<ActivityProfilePriceBinding>(R.layout.activity_profile_price) {
  private val viewModel: ProfilePriceVM by viewModels<ProfilePriceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroup100000218ThreeAdapter =
    Listgroup100000218ThreeAdapter(viewModel.listgroup100000218ThreeList.value?:mutableListOf())
    binding.recyclerListgroup100000218Three.adapter = listgroup100000218ThreeAdapter
    listgroup100000218ThreeAdapter.setOnItemClickListener(
    object : Listgroup100000218ThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listgroup100000218ThreeRowModel) {
        onClickRecyclerListgroup100000218Three(view, position, item)
      }
    }
    )
    viewModel.listgroup100000218ThreeList.observe(this) {
      listgroup100000218ThreeAdapter.updateData(it)
    }
    binding.profilePriceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAction1.setOnClickListener {
      val destIntent = ProfileBarCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAction.setOnClickListener {
      val destIntent = ProfileTimeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnmobile.setOnClickListener {
      val destIntent = ProfileInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLowprices.setOnClickListener {
      val destIntent = Frame3659Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListgroup100000218Three(
    view: View,
    position: Int,
    item: Listgroup100000218ThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_PRICE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfilePriceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
