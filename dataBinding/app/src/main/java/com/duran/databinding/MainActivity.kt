package com.duran.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.duran.databinding.databinding.ActivityMainBinding

/*
DataBinding

ViewBinding 과 무엇이 다른가?
이름처럼 데이터를 연결해주는 역할을 할 수 있다.(데이터와 같이 결합해서 사용할 수 있음)
DataBinding + LiveData
*/

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.dataBindingEx.text = "DataBinding을 사용해서 바뀐 텍스트"

    }
}