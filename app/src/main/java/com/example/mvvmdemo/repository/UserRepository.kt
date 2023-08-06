package com.example.mvvmdemo.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmdemo.api.ApiInterface
import com.example.mvvmdemo.model.User

class UserRepository(private val apiInterface:ApiInterface) {
    private val userLiveData = MutableLiveData<User>()

    val userdata : LiveData<User>
    get() = userLiveData
    suspend fun getUserData(){
        val result = apiInterface.getUserData()
        if(result.body() != null){
            userLiveData.postValue(result.body())
        }
    }
}