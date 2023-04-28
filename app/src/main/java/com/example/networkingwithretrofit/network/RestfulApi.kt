package com.example.networkingwithretrofit.network

import com.example.networkingwithretrofit.film.ResponseDataFilmItem
import com.example.networkingwithretrofit.news.ResponseDataNewsItem
import retrofit2.Call
import retrofit2.http.GET

interface RestfulApi {

    @GET("news")
    fun getAllNews(): Call<List<ResponseDataNewsItem>>

    @GET("film")
    fun getAllFilm(): Call<List<ResponseDataFilmItem>>

}