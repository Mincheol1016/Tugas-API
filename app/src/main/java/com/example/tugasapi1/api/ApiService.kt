package com.rival.getapipublic.api

import com.example.tugasapi1.response.ResponseAnime
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("v1")
    fun getAnime(): Call<ResponseAnime>
}