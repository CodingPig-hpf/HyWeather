package com.hyweather.android.ui.weather

/**
 * @author 黄沛锋
 * @email 1473054947@qq.com
 **/


import androidx.lifecycle.*
import com.hyweather.android.logic.Repository
import com.hyweather.android.logic.model.Location

class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat, placeName)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }

}