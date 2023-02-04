package com.example.run.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")  //An entity is a table in our database
data class Run (
    var img: Bitmap? = null, // image to preview our run
    var timestamp: Long = 0L, //Date of run is coverted in miliseconds
    var averageSpeedInKMH : Float = 0f,
    var distanceInMeters : Int = 0,
    var timeInMillis : Long = 0L, // Duration of a run
    var caloriesBurned : Int = 0
    )

{
 @PrimaryKey(autoGenerate = true)
 var id : Int? = null


}