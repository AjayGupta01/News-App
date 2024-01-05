package com.project.newsapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.project.newsapp.model.Article

@Database(entities = [Article::class], version = 1)
@TypeConverters(Converters::class)
abstract class ArticleDatabase() : RoomDatabase(){
   abstract fun getArticleDao():ArticlesDao

   companion object{
       @Volatile
       private var INSTANCE:ArticleDatabase ?= null
       fun getInstance(context: Context):ArticleDatabase{
           if (INSTANCE==null){
               synchronized(this){
                   if (INSTANCE==null){
                       INSTANCE=Room.databaseBuilder(
                           context.applicationContext,
                           ArticleDatabase::class.java,
                           "news_DB"
                       )
                           .build()
                   }
               }
           }
           return INSTANCE!!
       }
   }

}