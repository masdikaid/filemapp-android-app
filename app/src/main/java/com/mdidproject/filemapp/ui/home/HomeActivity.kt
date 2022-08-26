package com.mdidproject.filemapp.ui.home

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseActivity
import com.mdidproject.filemapp.databinding.ActivityHomeBinding


class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun getLayoutResID(): Int = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navView = (supportFragmentManager.findFragmentById(R.id.home_navhost) as NavHostFragment).navController

        binding.bottomNavigationView.setupWithNavController(navView)
    }
}