package com.project.newsapp.repository

import com.project.newsapp.api.RetrofitInstance
import com.project.newsapp.database.ArticleDatabase
import com.project.newsapp.model.Article

class NewsRepository(private val articleDB:ArticleDatabase) {

    private val articleDao=articleDB.getArticleDao()

    suspend fun getHeadlines(countryCode:String,pageNumber:Int) = RetrofitInstance.newsApiService.getHeadlines(countryCode, pageNumber)
    suspend fun searchNews(searchQuery:String,pageNumber:Int) = RetrofitInstance.newsApiService.searchNews(searchQuery,pageNumber)

    suspend fun upsert(article: Article) = articleDao.upsert(article)
    suspend fun getAllArticles() = articleDao.getAllArticles()
    suspend fun deleteArticle(article: Article) = articleDao.deleteArticle(article)
}