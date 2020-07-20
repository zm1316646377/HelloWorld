package com.example.helloworld.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.helloworld.R
import com.example.helloworld.viewmodel.ViewModelWithLiveData
import kotlinx.android.synthetic.main.activity_livedata.*;

class LiveDataTestActivity : AppCompatActivity() {

    private val mViewModel: ViewModelWithLiveData by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)
        imageButton1.setOnClickListener(mClickListener)
        imageButton2.setOnClickListener(mClickListener)
        mViewModel.getNum().observe(this, Observer<Int> { num ->
            welcome.setText(num.toString())
        })
    }

    private var mClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.imageButton1 -> {
                mViewModel.addNumber(1)
            }
            R.id.imageButton2 -> {
                mViewModel.addNumber(-1)
            }
        }
    }
}