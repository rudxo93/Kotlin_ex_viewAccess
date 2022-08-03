package com.duran.viewmodelshare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.duran.viewmodelshare.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    // MainViewModel을 사용할 수 있게 됨
    private val viewModel : MainViewModel by activityViewModels()

    private lateinit var binding : FragmentTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)

        binding.fragmentTest.text = viewModel.getCount().toString()

        return binding.root
    }

}