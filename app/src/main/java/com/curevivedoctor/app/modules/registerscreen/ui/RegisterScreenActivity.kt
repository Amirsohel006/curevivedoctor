package com.curevivedoctor.app.modules.registerscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityRegisterScreenBinding
import com.curevivedoctor.app.modules.frame3676.ui.Frame3676Activity
import com.curevivedoctor.app.modules.registerscreen.`data`.model.ListlanguageSevenRowModel
import com.curevivedoctor.app.modules.registerscreen.`data`.viewmodel.RegisterScreenVM
import com.curevivedoctor.app.modules.welcomescreensfive.ui.WelcomeScreensFiveActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RegisterScreenActivity :
    BaseActivity<ActivityRegisterScreenBinding>(R.layout.activity_register_screen) {
  private val viewModel: RegisterScreenVM by viewModels<RegisterScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlanguageSevenAdapter =
    ListlanguageSevenAdapter(viewModel.listlanguageSevenList.value?:mutableListOf())
    binding.recyclerListlanguageSeven.adapter = listlanguageSevenAdapter
    listlanguageSevenAdapter.setOnItemClickListener(
    object : ListlanguageSevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageSevenRowModel) {
        onClickRecyclerListlanguageSeven(view, position, item)
      }
    }
    )
    viewModel.listlanguageSevenList.observe(this) {
      listlanguageSevenAdapter.updateData(it)
    }
    binding.registerScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirmAndSubmit.setOnClickListener {
      val destIntent = Frame3676Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameArrowbackios.setOnClickListener {
      val destIntent = WelcomeScreensFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListlanguageSeven(
    view: View,
    position: Int,
    item: ListlanguageSevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REGISTER_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
