package com.duran.viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

/*
ViewModelFactory

ViewModelFactory를 이용해서 activity에서 viewModel을 생성할때 어떠한 값을 넘겨주는 것들을
해줄 수 있다.
*/

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelFactory = MainViewModelFactory(5000)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
    }
}