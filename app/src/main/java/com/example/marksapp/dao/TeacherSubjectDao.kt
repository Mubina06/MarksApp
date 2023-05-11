package com.example.marksapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.marksapp.entity.Subject
import com.example.marksapp.entity.TeacherSubject

@Dao
interface TeacherSubjectDao {

    @Insert
    fun addTeacherSubjec(teacherSubject: TeacherSubject)

    @Delete
    fun deleteTeacherSubjec(teacherSubject: TeacherSubject)


    @Query("select * from TeacherSubject where id = : id")
    fun getTeacherSubjecttById(id:Int): TeacherSubject

}