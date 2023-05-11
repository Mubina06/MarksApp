package com.example.marksapp.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) var user_id: Int,
    var user_name: String,
    var user_login: String,
    var user_password: String,
    var role: String)