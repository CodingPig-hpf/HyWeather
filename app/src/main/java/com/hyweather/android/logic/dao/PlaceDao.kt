package com.hyweather.android.logic.dao

/**
 * @author 黄沛锋
 * @email 1473054947@qq.com
 **/

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.hyweather.android.HyWeatherApplication
import com.hyweather.android.logic.model.Place

object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        HyWeatherApplication.context.getSharedPreferences("hy_weather", Context.MODE_PRIVATE)

}