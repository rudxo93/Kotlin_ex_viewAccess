package com.duran.viewmodelfactory

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num: Int) : ViewModel() {

    /*Repository에서 네트워크 통신을 하거나 LocalDB(RoomDB, SQLite)에서 데이터를 받아오는 코드를
      viewModel에서 사용할 수도있다.
      Repository나 LocalDB같은 정보를 Activity에서 ViewModel로 넘겨주고 싶을때 현재 viewModel형태에는
      값을 넘기는것이 없다.
      viewModel로 값을 넘겨주고 싶을때 ViewModelFactory를 사용한다.
    */
    init {
        Log.e("MainViewModel", num.toString())
    }

}