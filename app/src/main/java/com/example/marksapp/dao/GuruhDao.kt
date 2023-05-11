package com.example.marksapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.marksapp.entity.Guruh
import com.example.marksapp.entity.Subject

@Dao
interface GuruhDao {
    @Insert
    fun addGuruh(guruh: Guruh)

    @Delete
    fun deleteGuruh(guruh: Guruh)

    @Query("select * from guruh: Guruh")
    fun getAllGuruh():List<Guruh>

    @Query("select * from Guruh where id = : id")
    fun getGuruhById(id:Int): Guruh
}