package com.example.mvvmdemo.model

data class User(
    val message: String,
    val statuscode: Int,
    val userDetails: List<UserDetail>
)