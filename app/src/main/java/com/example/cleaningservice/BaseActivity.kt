package com.example.cleaningservice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        initData()
        initListener()
    }

    abstract fun initView()
    abstract fun initData()
    abstract fun initListener()
}