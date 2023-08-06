package com.example.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvvmdemo.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    var userViewModel : UserViewModel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}