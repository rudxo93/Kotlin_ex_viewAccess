package com.duran.databindinganddataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.duran.databindinganddataclass.databinding.ActivityMainBinding

/*
DataBindiong

이름처럼, 뭔가 데이터를 어쩌고 저쩌고 해줄수 없을까?(연결)
-> 데이터 결합
*/

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var testCount = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        // 기존의 방법
        // binding.test.text = "데이터 바인딩을 사용하여 바뀐 텍스트"

        // 데이터 결합
        val person = Person("이순신", 30)
        binding.user = person

    }

    // 레이아웃에 onclick에 함수를 넣어주면 실행이 된다.
    fun myClick(view: View) {
        Log.d("MainActivity", "onclick")
        testCount++

        val person = Person("이순신", testCount)
        binding.user = person

    }
}