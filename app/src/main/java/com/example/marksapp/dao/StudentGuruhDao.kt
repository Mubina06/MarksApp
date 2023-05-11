package com.example.marksapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.marksapp.entity.StudentGuruh
import com.example.marksapp.entity.Subject

@Dao
interface StudentGuruhDao {

    @Insert
    fun addStudentGuruh(studentGuruh: StudentGuruh)

    @Delete
    fun deleteStudentGuruh(studentGuruh: StudentGuruh)

    @Query("select * from StudentGuruh")
    fun getAllSubject():List<Subject>

    @Query("select * from StudentGuruh where id = : id")
    fun getSubjectById(id:Int): StudentGuruh



}