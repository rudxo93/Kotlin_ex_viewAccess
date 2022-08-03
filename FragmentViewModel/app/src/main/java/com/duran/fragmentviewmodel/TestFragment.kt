package com.duran.fragmentviewmodel

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/*
공식문서 https://developer.android.com/guide/fragments/lifecycle 를 보게되면
Fragment에도 라이프사이클이 있다.
*/

class TestFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("TestFragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TestFragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e("TestFragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onResume() {
        super.onResume()
        Log.e("TestFragment", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TestFragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TestFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TestFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TestFragment", "onDetach")
    }

}