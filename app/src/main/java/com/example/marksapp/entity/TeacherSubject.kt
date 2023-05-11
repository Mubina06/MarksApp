package com.example.marksapp.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.marksapp.entity.Guruh


@Entity(
    foreignKeys = [

        ForeignKey(
            entity = User::class,
            parentColumns = ["user_id"],
            childColumns = ["teacher"]
        ),
    ForeignKey(
        entity = Subject::class,
        parentColumns = ["subject_id"],
        childColumns = ["subject"]
    ),
        ForeignKey(
            entity = Guruh::class,
            parentColumns = ["guruh_id"],
            childColumns = ["guruh"]
        )

    ]

)

data class TeacherSubject(
    @PrimaryKey(autoGenerate = true) var teacher_id: Int,
    var teacher: Int,
    var subject: Int,
    var guruh: Int
)