package com.example.cleaningservice

import android.content.Intent
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit


class SplashActivity: BaseActivity() {

    override fun initView() {
    }

    override fun initData() {
        Observable.timer(Constants.SPLASH_DELAY, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
                this.finish()
            }
    }

    override fun initListener() {
    }
}