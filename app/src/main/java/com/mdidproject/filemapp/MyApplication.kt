package com.mdidproject.filemapp

import android.app.Application

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initDependencyInjection()
    }

    private fun initDependencyInjection() {
    }
}