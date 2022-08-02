package com.mdidproject.movupapp.abstraction.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B: ViewDataBinding>: AppCompatActivity() {
    private lateinit var mViewBinding: B
    val binding get() = mViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = DataBindingUtil.setContentView(this, getLayoutResID())
    }

    @LayoutRes
    abstract fun getLayoutResID(): Int
}