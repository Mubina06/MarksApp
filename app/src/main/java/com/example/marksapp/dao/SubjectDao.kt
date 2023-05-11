package com.example.marksapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.marksapp.entity.Subject

@Dao
interface SubjectDao {

    @Insert
    fun addSubject(subject: Subject)

    @Delete
    fun deleteSubject(subject: Subject)

    @Query("select * from Subject")
    fun getAllSubject():List<Subject>

    @Query("select * from Subject where id = : id")
    fun getSubjectById(id:Int): Subject

}