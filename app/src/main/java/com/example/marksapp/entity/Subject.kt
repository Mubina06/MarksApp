package com.example.marksapp.entity

import androidx.room.PrimaryKey

data class Subject(
    @PrimaryKey(autoGenerate = true) var subject_id: Int,
    var subject_name: String)