package com.example.marksapp.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject(
    @PrimaryKey(autoGenerate = true) var subject_id: Int,
    var subject_name: String)