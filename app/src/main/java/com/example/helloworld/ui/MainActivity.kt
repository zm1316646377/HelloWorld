package com.example.helloworld.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.TextView
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    private var mDisplay: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mDisplay = findViewById(R.id.textView2)
//        mDisplay?.setText("Kathy")
        leftBtn.setOnClickListener { view ->
            Log.i("Test", "".plus(view.id))
            textView2.setText(R.string.button_left)
        }

        rightBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                textView2.setText(R.string.button_right)
            }
        })

        switch1.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(btn: CompoundButton?, b: Boolean) {
                textView2.text = if (b) "开" else "关"
            }
        })

        radioGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
                TODO("Not yet implemented")
            }
        })
    }
}