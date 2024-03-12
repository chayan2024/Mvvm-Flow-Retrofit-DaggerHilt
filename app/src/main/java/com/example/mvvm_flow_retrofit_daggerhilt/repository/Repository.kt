package com.example.mvvm_flow_retrofit_daggerhilt.repository

import com.example.mvvm_flow_retrofit_daggerhilt.model.Comments
import com.example.mvvm_flow_retrofit_daggerhilt.service.ApiService
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {
    suspend fun getComments(): List<Comments> {
        return apiService.getComments()
    }
}
