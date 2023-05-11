package com.example.marksapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.marksapp.entity.Marks


@Dao
interface MarksDao {

    @Insert
    fun addMarks(marks: Marks)

    @Delete
    fun deleteMarks(marks: Marks)

}