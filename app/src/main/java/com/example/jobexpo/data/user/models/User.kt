package com.example.jobexpo.data.user.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class User(@PrimaryKey val id: String, val username: String, val lastName: String?, val firstName: String?, val phoneNumber: String?) {

    lateinit var categories: Array<String>
    lateinit var country: String
    val fullName: String? get() {
        if (firstName === null && lastName === null)
            return null
        return "${firstName} ${lastName}"
    }
}