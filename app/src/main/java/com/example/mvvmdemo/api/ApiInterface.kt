package com.example.mvvmdemo.api

import com.example.mvvmdemo.model.User
import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @GET("/43ea2ba0-22cf-4a04-ba1b-e62e88aaaa52")
    suspend fun getUserData() : Response<User>

    @POST("43ea2ba0-22cf-4a04-ba1b-e62e88aaaa52")
    suspend fun getUserDataByPostingRequestBody(jsonObject: JsonObject) : Response<User>
}