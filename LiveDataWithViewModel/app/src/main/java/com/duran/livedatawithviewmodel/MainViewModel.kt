package com.duran.livedatawithviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// LiveData와 MutableLiveData
// https://developer.android.com/codelabs/kotlin-android-training-live-data?index=..%2F..android-kotlin-fundamentals&hl=fi_FI#5

class MainViewModel : ViewModel() {

    private var _testMutableLiveData = MutableLiveData(0)
    val testLiveData : LiveData<Int>
        get() = _testMutableLiveData

    fun plusLiveDataValue() {
        _testMutableLiveData.value = _testMutableLiveData.value!!.plus(1)
    }

    /*var testMutableLiveData = MutableLiveData(0)

    // MutableLiveData <-> LiveData

    fun plusLiveDataValue() {
        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
    }*/

}