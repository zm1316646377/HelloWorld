package com.example.helloworld.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityShareprefBinding
import com.example.helloworld.viewmodel.SharedPrefViewModel

class ViewModelSHPTestActivity : AppCompatActivity() {

    private val mViewModel: SharedPrefViewModel by viewModels()

    private lateinit var mBinding: ActivityShareprefBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_sharepref)
        mBinding.data = mViewModel
        mBinding.lifecycleOwner = this
    }
}