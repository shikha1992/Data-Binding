package com.example.bindingdemo1

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.bindingdemo1.databinding.DataCnnectingBinding
import com.example.bindingdemo1.viewmodel.DataConnectingViewModel

class DataConnecting : BaseActivity() {

    lateinit var binding: DataCnnectingBinding
    private lateinit var viewModel: DataConnectingViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.student = viewModel.setStudentData()
    }

    override fun setBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.data_cnnecting)
    }

    override fun setViewModel() {
        viewModel =
            ViewModelProvider(this).get(DataConnectingViewModel::class.java)

    }
}