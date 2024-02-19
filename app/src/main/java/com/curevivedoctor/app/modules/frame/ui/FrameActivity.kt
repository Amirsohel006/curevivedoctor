package com.curevivedoctor.app.modules.frame.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.base.BaseActivity
import com.curevivedoctor.app.databinding.ActivityFrameBinding
import com.curevivedoctor.app.modules.frame.`data`.model.ListellipseEightRowModel
import com.curevivedoctor.app.modules.frame.`data`.model.ListrectangleFifteenRowModel
import com.curevivedoctor.app.modules.frame.`data`.model.ListrectangleThirteenRowModel
import com.curevivedoctor.app.modules.frame.`data`.viewmodel.FrameVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FrameActivity : BaseActivity<ActivityFrameBinding>(R.layout.activity_frame) {
  private val viewModel: FrameVM by viewModels<FrameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangleThirteenAdapter =
    ListrectangleThirteenAdapter(viewModel.listrectangleThirteenList.value?:mutableListOf())
    binding.recyclerListrectangleThirteen.adapter = listrectangleThirteenAdapter
    listrectangleThirteenAdapter.setOnItemClickListener(
    object : ListrectangleThirteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangleThirteenRowModel) {
        onClickRecyclerListrectangleThirteen(view, position, item)
      }
    }
    )
    viewModel.listrectangleThirteenList.observe(this) {
      listrectangleThirteenAdapter.updateData(it)
    }
    val listrectangleFifteenAdapter =
    ListrectangleFifteenAdapter(viewModel.listrectangleFifteenList.value?:mutableListOf())
    binding.recyclerListrectangleFifteen.adapter = listrectangleFifteenAdapter
    listrectangleFifteenAdapter.setOnItemClickListener(
    object : ListrectangleFifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectangleFifteenRowModel) {
        onClickRecyclerListrectangleFifteen(view, position, item)
      }
    }
    )
    viewModel.listrectangleFifteenList.observe(this) {
      listrectangleFifteenAdapter.updateData(it)
    }
    val listellipseEightAdapter =
    ListellipseEightAdapter(viewModel.listellipseEightList.value?:mutableListOf())
    binding.recyclerListellipseEight.adapter = listellipseEightAdapter
    listellipseEightAdapter.setOnItemClickListener(
    object : ListellipseEightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseEightRowModel) {
        onClickRecyclerListellipseEight(view, position, item)
      }
    }
    )
    viewModel.listellipseEightList.observe(this) {
      listellipseEightAdapter.updateData(it)
    }
    binding.frameVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectangleThirteen(
    view: View,
    position: Int,
    item: ListrectangleThirteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangleFifteen(
    view: View,
    position: Int,
    item: ListrectangleFifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipseEight(
    view: View,
    position: Int,
    item: ListellipseEightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FRAME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
