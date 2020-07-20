package com.example.helloworld.ui.nav2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.helloworld.R

// Navigation实现传参
class NavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation2)
        var controller = Navigation.findNavController(this, R.id.nav_host_fragment)
        // 添加ActionBar
        NavigationUI.setupActionBarWithNavController(this, controller)
    }

    override fun onSupportNavigateUp(): Boolean {
        // ActionBar返回按钮
        var controller = Navigation.findNavController(this, R.id.nav_host_fragment)
        return controller.navigateUp()
    }
}