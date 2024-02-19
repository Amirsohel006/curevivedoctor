package com.curevivedoctor.app.modules.chats.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curevivedoctor.app.modules.chats.`data`.model.ChatsModel
import com.curevivedoctor.app.modules.chats.`data`.model.ListellipseFourRowModel
import com.curevivedoctor.app.modules.chats.`data`.model.ListellipseRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChatsVM : ViewModel(), KoinComponent {
  val chatsModel: MutableLiveData<ChatsModel> = MutableLiveData(ChatsModel())

  var navArguments: Bundle? = null

  val listellipseList: MutableLiveData<MutableList<ListellipseRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipseFourList: MutableLiveData<MutableList<ListellipseFourRowModel>> =
      MutableLiveData(mutableListOf())
}
