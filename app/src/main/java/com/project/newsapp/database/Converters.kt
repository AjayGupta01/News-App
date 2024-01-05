package com.project.newsapp.database

import androidx.room.TypeConverter
import com.project.newsapp.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) : String = source.name

    @TypeConverter
    fun toSource(name: String) : Source = Source(name,name)

}