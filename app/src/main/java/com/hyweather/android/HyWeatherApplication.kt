package com.hyweather.android

/**
 * @author 黄沛锋
 * @email 1473054947@qq.com
 **/

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context



class HyWeatherApplication :Application(){

    companion object {

        const val TOKEN = "" // 填入你申请到的令牌值

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}