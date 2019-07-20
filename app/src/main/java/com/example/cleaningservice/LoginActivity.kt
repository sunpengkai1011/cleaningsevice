package com.example.cleaningservice

import android.graphics.Paint
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.view_title_bar.*

class LoginActivity : BaseActivity() {

    override fun initView() {
        setContentView(R.layout.activity_login)
        tvTitleBar.text = resources.getText(R.string.text_login).toString().toUpperCase()
        tvRegister.paint.flags = Paint.UNDERLINE_TEXT_FLAG
    }

    override fun initData() {

    }

    override fun initListener() {
    }
}
