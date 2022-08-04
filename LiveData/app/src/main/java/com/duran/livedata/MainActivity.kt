package com.duran.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

/*
LiveData
https://developer.android.com/topic/libraries/architecture/livedata -> 구글 공식문서 참조

데이터를 관찰해줄 수 있는 친구(LifeCycle과 결합해서)
*/

class MainActivity : AppCompatActivity() {

    // 보통은 viewModel과 같이 사용한다.
    private var testMutableLiveData = MutableLiveData(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnArea).setOnClickListener {
            testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
        }

        testMutableLiveData.observe(this, Observer {
            Log.e("testMutableLiveData", testMutableLiveData.value!!.toString())
            findViewById<TextView>(R.id.textArea).text = testMutableLiveData.value!!.toString()
        })

    }
}