package com.duran.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

/*
ViewModel

1 - https://developer.android.com/topic/libraries/architecture/viewmodel -> viewModel 공식 문서
2 - https://developer.android.com/guide/components/activities/activity-lifecycle?hl=ko -> 활동 생명주기 공식 문서

ViewModel(공식문서 요약)
안드로이드의 생명주기를 관리하기 쉽다.
onSaveInstanceState()를 사용해서 데이터를 관리할 수 있지만 적절하지 않다.
안드로이드의 생명주기를 관리하기 쉽다라는 말과 같은 말인데 상태(LifeCycle)가 변경될 때 마다
데이터를 관리해줘야 하는데 이 관리가 편하다.
UI컨트롤러(Activity, Fragment)에서 모든 것을 다 하려고 하면 복잡해진다.
그렇기 때문에 ViewModel을 사용하면 테스트나 관리가 용이하다.
*/

class MainActivity : AppCompatActivity() {

    private var countValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "onCreate")

        val plusBtn: Button = findViewById(R.id.plus)
        val minusBtn: Button = findViewById(R.id.minus)

        val resultArea : TextView = findViewById(R.id.result)

        plusBtn.setOnClickListener {
            countValue++
            resultArea.text = countValue.toString()
        }

        minusBtn.setOnClickListener {
            countValue--
            resultArea.text = countValue.toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy")
    }
}