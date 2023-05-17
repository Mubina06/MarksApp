package com.example.marksapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.marksapp.entity.User

@Dao
interface UserDao {
    @Query("select * from User")
    fun getAllUsers(): List<User>

    @Insert
    fun addUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Query(
        "select * from User where user_id = :id"
    )
    fun getUsersById(id: Int):User

    @Query(
        "select * from User where user_login = :user_login AND user_password = :user_password"
    )

    fun getUser(user_login: String, user_password: String): User

}