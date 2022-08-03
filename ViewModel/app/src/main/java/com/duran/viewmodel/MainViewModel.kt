package com.duran.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

/*
 ViewModel에서 아래와 같이 딸랑 변수하나만 만들어서 사용하지는 않고
 LiveData(등등)을 이용해서 함께 사용한다.

 아래는 예제니까 참고정도만..!
*/

class MainViewModel : ViewModel() {

    var countValue = 0

    init {
        Log.e("MainViewModel", "init")
    }

    fun plus() {
        countValue++
        Log.e("MainViewModel", countValue.toString())
    }

    fun minus(){
        countValue--
        Log.e("MainViewModel", countValue.toString())
    }

    fun getCount() : Int {
        return countValue
    }

}