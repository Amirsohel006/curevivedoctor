package com.curevivedoctor.app.modules

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.curevivedoctor.app.databinding.SlideitemHome2Binding
import java.util.ArrayList

class SlideRectangleSplashAdapter(
    val dataList: ArrayList<ImageSliderSliderrectangletwoModel>,
    val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderrectangletwoModel>(dataList, mIsInfinite) {
    override fun bindView(
        binding: ViewBinding,
        listPosition: Int,
        viewType: Int
    ) {
        if (binding is SlideitemHome2Binding) {
            binding.imageSliderSliderrectangletwoModel = dataList[listPosition]
        }
    }

    override fun inflateView(
        viewType: Int,
        container: ViewGroup,
        listPosition: Int
    ): ViewBinding {
        val itemBinding =  SlideitemHome2Binding.inflate(
            LayoutInflater.from(container.context),
            container,
            false
        )
        return itemBinding
    }
}
