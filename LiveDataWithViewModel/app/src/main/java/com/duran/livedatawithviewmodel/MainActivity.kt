package com.duran.livedatawithviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        findViewById<Button>(R.id.btnArea).setOnClickListener {
            viewModel.plusLiveDataValue()
        }

        viewModel.testLiveData.observe(this, Observer {
            findViewById<TextView>(R.id.textArea).text = it.toString()
        })

        // viewModel.testLiveData.value = 10 -> activity에서 임의로 값을 수정할 수 없다. viewModel에서만 가능하다.

   /*     findViewById<Button>(R.id.btnArea).setOnClickListener {
            viewModel.plusLiveDataValue()
        }

        viewModel.testMutableLiveData.observe(this, Observer {
            findViewById<TextView>(R.id.textArea).text = viewModel.testMutableLiveData.value!!.toString()
            // findViewById<TextView>(R.id.textArea).text = it.toString() -> 위와 같은 방법
        })

        viewModel.testMutableLiveData.value = 10*/

    }
}