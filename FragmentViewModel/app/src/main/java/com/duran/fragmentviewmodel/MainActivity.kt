package com.duran.fragmentviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
Activity ViewModel 화면 회전해도 데이터가 유지되도록
Fragment는 어떻게 될까?
공식문서 https://developer.android.com/guide/fragments/lifecycle 를 보게되면
Fragment에도 라이프사이클이 있다.
*/

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = manager.beginTransaction()
        val fragment = TestFragment()
        transaction.replace(R.id.frameArea, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}