package com.hyweather.android.logic.model

/**
 * @author 黄沛锋
 * @email 1473054947@qq.com
 **/

import com.google.gson.annotations.SerializedName

class RealtimeResponse(val status: String, val result: Result) {

    class Result(val realtime: Realtime)

    class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)

    class AirQuality(val aqi: AQI)

    class AQI(val chn: Float)

}