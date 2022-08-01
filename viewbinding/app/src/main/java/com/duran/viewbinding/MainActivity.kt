package com.duran.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duran.viewbinding.databinding.ActivityMainBinding

/*
ViewBinding

Activity와 Fragment 사용하는 방법을 숙지
*/

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.testText.text = "이것은 변경된 텍스트입니다."
    }
}