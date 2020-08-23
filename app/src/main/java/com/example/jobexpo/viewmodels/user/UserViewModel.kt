package com.example.jobexpo.viewmodels.user

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jobexpo.data.user.UserRepository
import com.example.jobexpo.data.user.models.User
import java.util.*

class UserViewModel(val repository: UserRepository): ViewModel() {

    val currentUser: LiveData<User> = repository.getUser("1")

    fun setCurrentUser(user: User) {
        repository.setUser(user)
    }
}