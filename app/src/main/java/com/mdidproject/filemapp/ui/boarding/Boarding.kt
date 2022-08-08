package com.mdidproject.filemapp.ui.boarding

import android.os.Bundle
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseActivity
import com.mdidproject.filemapp.databinding.ActivityBoardingBinding

class Boarding : BaseActivity<ActivityBoardingBinding>() {
    override fun getLayoutResID(): Int = R.layout.activity_boarding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}