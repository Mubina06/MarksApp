package com.example.marksapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.marksapp.dao.SubjectDao
import com.example.marksapp.dao.UserDao
import com.example.marksapp.entity.*

@Database(entities = [User::class, Guruh::class, Marks::class, StudentGuruh::class, Subject::class, TeacherSubject::class], version = 1)

abstract class AppDatabase: RoomDatabase() {

    abstract fun getUserDao():UserDao
    abstract fun SubjectDao():SubjectDao


    companion object{
        var instanse: AppDatabase? = null

        fun getInstance(context: Context):AppDatabase{
            if (instanse == null){
                instanse = Room.databaseBuilder(context, AppDatabase::class.java, "app_db")
                    .allowMainThreadQueries()
                    .build()
            }
            return instanse!!
        }

    }

}