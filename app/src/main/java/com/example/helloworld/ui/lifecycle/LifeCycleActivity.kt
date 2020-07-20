package com.example.helloworld.ui.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_life_cycle.*

class LifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        lifecycle.addObserver(chronometer)
    }

//    override fun onResume() {
//        super.onResume()
//        chronometer.base = SystemClock.elapsedRealtime().minus(mElapsedTime ?: 0)
//        chronometer.start()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        mElapsedTime = SystemClock.elapsedRealtime() - chronometer.base
//        chronometer.stop()
//    }
}