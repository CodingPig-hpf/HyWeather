package com.hyweather.android.logic.network

/**
 * @author 黄沛锋
 * @email 1473054947@qq.com
 **/

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T>  create(ServiceClass: Class<T>) :T = retrofit.create(ServiceClass)

    inline fun <reified T>create():T = create(T :: class.java)
}