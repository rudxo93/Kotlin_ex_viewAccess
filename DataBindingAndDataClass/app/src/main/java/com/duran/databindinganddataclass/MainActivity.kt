package com.duran.databindinganddataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.duran.databindinganddataclass.databinding.ActivityMainBinding

/*
DataBindiong

이름처럼, 뭔가 데이터를 어쩌고 저쩌고 해줄수 없을까?(연결)
-> 데이터 결합
*/

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        // 기존의 방법
        binding.test.text = "데이터 바인딩을 사용하여 바뀐 텍스트"
    }
}