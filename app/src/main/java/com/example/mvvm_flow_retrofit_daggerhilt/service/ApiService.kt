package com.example.mvvm_flow_retrofit_daggerhilt.service

import com.example.mvvm_flow_retrofit_daggerhilt.model.Comments
import retrofit2.http.GET

interface ApiService {
    @GET("/posts/1/comments")
    suspend fun getComments(): List<Comments>
}
