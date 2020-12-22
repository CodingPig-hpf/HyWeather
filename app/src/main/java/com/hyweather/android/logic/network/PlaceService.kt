package com.hyweather.android.logic.network

/**
 * @author 黄沛锋
 * @email 1473054947@qq.com
 **/

import com.hyweather.android.HyWeatherApplication
import com.hyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${HyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}