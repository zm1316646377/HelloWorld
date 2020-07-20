package com.example.helloworld.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.R
import com.example.helloworld.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_viewmodel.*;

class ViewModelTestActivity : AppCompatActivity() {

    private val mViewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        welcome.text = mViewModel.mNum.toString()
//        plus_btn1.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(p0: View?) {
//                mViewModel.mNum++
//                welcome.text = (mViewModel.mNum.toString())
//            }
//        })
//
//        plus_btn12.setOnClickListener { view ->
//            mViewModel.mNum += 2;
//            welcome.text = (mViewModel.mNum.toString())
//        }
        plus_btn1.setOnClickListener(mClickListener)
        plus_btn12.setOnClickListener(mClickListener)
    }

    private var mClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.plus_btn1 -> {
                mViewModel.mNum++
                welcome.text = (mViewModel.mNum.toString())
            }
            R.id.plus_btn12 -> {
                mViewModel.mNum += 2;
                welcome.text = (mViewModel.mNum.toString())
            }
        }
    }
}