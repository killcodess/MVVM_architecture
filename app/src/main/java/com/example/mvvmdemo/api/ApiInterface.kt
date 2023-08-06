package com.example.mvvmdemo.api

import com.example.mvvmdemo.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/43ea2ba0-22cf-4a04-ba1b-e62e88aaaa52")
    suspend fun getUserData() : Response<User>
}