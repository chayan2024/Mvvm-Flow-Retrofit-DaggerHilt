package com.example.mvvm_flow_retrofit_daggerhilt.model

data class Comments(
    val id: Int,
    val postId: Int,
    val name: String,
    val email: String,
    val body: String
)