package com.example.jobexpo

import com.example.jobexpo.data.user.models.User
import org.junit.Test
import java.lang.AssertionError

class UserDataTest {

    @Test
    fun getUserFullName_nullTest() {
        val user = User(
            username = "",
            lastName = null,
            firstName = null,
            phoneNumber = null
        )

        if (user.fullName === null) {
            assert(true)
        } else {
            throw AssertionError("Result was not null")
        }
    }


    @Test
    fun getUserFullName_notNullTest() {
        val user = User(
            username = "",
            lastName = "Cheung",
            firstName = "Nelson",
            phoneNumber = null
        )

        if (user.fullName !== null) {
            assert(true)
        } else {
            throw AssertionError("Result was null")
        }
    }

    @Test
    fun getUserFullName_ResultTest() {
        val lastName = "Cheung"
        val firstName = "Nelson"

        val user = User(
            username = "",
            lastName = lastName,
            firstName = firstName,
            phoneNumber = null
        )

        val expectedResult = "${firstName} ${lastName}"

        if (user.fullName != null && user.fullName.equals(expectedResult) ) {
            assert(true)
        } else {
            throw AssertionError("Result(${user.fullName}) was not correct, should be (${expectedResult})")
        }
    }

}