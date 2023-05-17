package com.example.marksapp.entity

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Guruh(
    @PrimaryKey(autoGenerate = true) var guruh_id: Int,
    var guruh_name: String,
    var grade: Int)