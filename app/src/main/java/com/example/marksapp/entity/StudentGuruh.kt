package com.example.marksapp.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.marksapp.entity.Guruh

@Entity(
    foreignKeys = [

        ForeignKey(
            entity = Guruh::class,
            parentColumns = ["guruh_id"],
            childColumns = ["guruh"]
        ),


    ]

)

data class StudentGuruh(
    @PrimaryKey(autoGenerate = true) var studentGuruh_id: Int,
    var guruh: Int
)