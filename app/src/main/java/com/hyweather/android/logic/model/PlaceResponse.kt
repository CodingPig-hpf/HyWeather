package com.hyweather.android.logic.model

/**
 * @author 黄沛锋
 * @email 1473054947@qq.com
 **/

import com.google.gson.annotations.SerializedName



data class PlaceResponse(val status: String ,val places :List<Place>)

data class Place(val name:String,val location:Location,@SerializedName("formatted_address") val address: String)

data class Location(val lng:String,val lat:String)
