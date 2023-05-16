package com.example.marksapp.entity


import androidx.room.Entity

@Entity
data class User(
    var user_name: String,
    var user_login: String,
    var user_password: String,
    var role: String
)