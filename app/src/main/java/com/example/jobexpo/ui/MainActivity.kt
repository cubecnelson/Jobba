package com.example.jobexpo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.jobexpo.data.user.models.User
import com.example.jobexpo.databinding.ActivityMainBinding
import com.example.jobexpo.viewmodels.user.UserViewModel

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater);

        val userViewModel: UserViewModel = ViewModelProvider(this).get(
            UserViewModel::class.java)



        userViewModel.currentUser.observe(this) {user ->
            run {
                binding.fullName.text = user?.fullName
                binding.username.text = "@${user?.username}"
            }
        }
        userViewModel.setCurrentUser(User("1", "cubecnelson", "Cheung", "Nelson", "93756971"))
        setContentView(binding.root)
    }
}
