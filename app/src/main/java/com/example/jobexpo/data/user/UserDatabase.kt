package com.example.jobexpo.data.user

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jobexpo.data.user.models.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase()