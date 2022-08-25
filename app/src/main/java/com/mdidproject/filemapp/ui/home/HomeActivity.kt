package com.mdidproject.filemapp.ui.home

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseActivity
import com.mdidproject.filemapp.databinding.ActivityHomeBinding


class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun getLayoutResID(): Int = R.layout.activity_boarding

    override fun onCreate(savedInstanceState: Bundle?) {

        val navView = binding.homeNavhost.findNavController()

        val menuConfig = AppBarConfiguration.Builder(
            R.id.home_menu,
            R.id.stream_menu,
            R.id.ticket_menu,
            R.id.profile_menu
        ).build()

        setupActionBarWithNavController(navView, menuConfig)
        binding.bottomNavigationView.setupWithNavController(navView)
        super.onCreate(savedInstanceState)
    }
}