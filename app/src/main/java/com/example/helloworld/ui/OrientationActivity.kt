package com.example.helloworld.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_orientation.*;

class OrientationActivity : AppCompatActivity() {

    private val TAG: String = "OrientationActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orientation)
        welcome.setText(savedInstanceState?.getString("key"))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("key", "Kathy")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }
}