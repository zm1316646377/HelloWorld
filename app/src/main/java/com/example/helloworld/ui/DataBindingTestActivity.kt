package com.example.helloworld.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityDatabindingBinding
import com.example.helloworld.viewmodel.DataBindingViewModel

class DataBindingTestActivity : AppCompatActivity() {

    private val mViewModel: DataBindingViewModel by viewModels()

    private lateinit var mBinding: ActivityDatabindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding)
        mBinding.data = mViewModel
        mBinding.lifecycleOwner = this
    }
}