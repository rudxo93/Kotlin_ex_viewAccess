package com.duran.fragmentlivedataandviewlifecycleowner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duran.fragmentlivedataandviewlifecycleowner.databinding.ActivityMainBinding

/*
Fragment LiveData / viewLifecyclerOwner

 * 구글 공식 문서
https://developer.android.google.cn/codelabs/kotlin-android-training-live-data/index.html?index=..%2F..android-kotlin-fundamentals&hl=IT#4
https://developer.android.com/topic/libraries/view-binding

*/

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.btn1.setOnClickListener {
            val transaction1 = manager.beginTransaction()
            val fragment1 = BlankFragment1()
            transaction1.replace(R.id.frameArea, fragment1)
            transaction1.addToBackStack(null)
            transaction1.commit()
        }

        binding.btn2.setOnClickListener {
            val transaction2 = manager.beginTransaction()
            val fragment2 = BlankFragment2()
            transaction2.replace(R.id.frameArea, fragment2)
            transaction2.addToBackStack(null)
            transaction2.commit()
        }
    }
}