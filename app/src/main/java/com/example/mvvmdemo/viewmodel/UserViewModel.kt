package com.example.mvvmdemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mvvmdemo.model.User
import com.example.mvvmdemo.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository): ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO){
            userRepository.getUserData()
        }
    }
    val userData : LiveData<User>
    get() = userRepository.userdata

}