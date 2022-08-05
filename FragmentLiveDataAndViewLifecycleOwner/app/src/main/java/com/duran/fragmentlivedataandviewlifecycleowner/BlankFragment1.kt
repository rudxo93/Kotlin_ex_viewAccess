package com.duran.fragmentlivedataandviewlifecycleowner

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.duran.fragmentlivedataandviewlifecycleowner.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {

    // ViewBinding + LiveData

    private val TAG = "BlankFragment1"

    private var _binding : FragmentBlank1Binding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: BlankViewModel1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBlank1Binding.inflate(inflater, container, false)
        val view = binding.root

        viewModel = ViewModelProvider(this).get(BlankViewModel1::class.java)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn1.setOnClickListener {
            viewModel.plusCountValue()
        }

        // viewLifecycleOwner에 대한 구글 공식문서
        // https://developer.android.google.cn/codelabs/kotlin-android-training-live-data/index.html?index=..%2F..android-kotlin-fundamentals&hl=IT#4
        viewModel.liveCount.observe(viewLifecycleOwner, Observer {
            binding.text1.text = it.toString()
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }

}