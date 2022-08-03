package com.duran.fragmentviewmodel

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.duran.fragmentviewmodel.databinding.FragmentTestBinding

/*
공식문서 https://developer.android.com/guide/fragments/lifecycle 를 보게되면
Fragment에도 라이프사이클이 있다.

밑에 예제를 통해서 viewModel을 구현하고 연결한 뒤 실행시키게 되면
Activity와 같이 화면전환시 값이 유지되는 것이 아니라 값이 다시 초기화가 되버린다.
viewModel을 사용한다고 값이 유지되는 것이 아니라 Fragment는 Activity에 붙어있다.
그렇기 때문에 Activity의 라이프사이클에 영향을 받기 때문에 Fragment에 딸랑 ViewModel을
붙혀넣는다고 값을 유지할 수가 없다.

구글 공식문서에는 Activity와 Fragment와 ViewModel에 대해 ViewModel을 공유하는 것들에 대해
설명하고 있다.
ViewModel을 공유하는 방법에 대해 다음 프로젝트를 통해 알아볼 예정
*/

class TestFragment : Fragment() {

    private lateinit var binding: FragmentTestBinding

    var countValue = 0

    private lateinit var viewModel: TestFragmentViewModel

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

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)

        viewModel = ViewModelProvider(this).get(TestFragmentViewModel::class.java)

        binding.resultArea.text = viewModel.getCount().toString()

        binding.plus.setOnClickListener {
//            countValue++
//            binding.resultArea.text = countValue.toString()
            viewModel.plus()
            binding.resultArea.text = viewModel.getCount().toString()
        }

        binding.minus.setOnClickListener {
//            countValue--
//            binding.resultArea.text = countValue.toString()
            viewModel.minus()
            binding.resultArea.text = viewModel.getCount().toString()
        }

        return binding.root
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