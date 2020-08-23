package com.example.jobexpo.data.user

import androidx.lifecycle.LiveData
import com.example.jobexpo.data.user.models.User
import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

// Informs Dagger that this class should be constructed only once.
@Singleton
class UserRepository @Inject constructor(
   // Simple in-memory cache. Details omitted for brevity.
    private val executor: Executor,
    private val userDao: UserDao
) {
   fun getUser(userId: String): LiveData<User> {
//       refreshUser(userId)
       // Returns a LiveData object directly from the database.
       return userDao.load(userId)
   }

    fun setUser(user: User) {
        userDao.save(user)

    }

   companion object {
       val FRESH_TIMEOUT = TimeUnit.DAYS.toMillis(1)
   }
}