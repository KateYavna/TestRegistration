package com.example.testregistration

class DataValidator {

    fun checkAll (login: String,email: String,password: String,address: String,age:String):Boolean {
        return if (!isLoginValid(login))false
        else if (!isEmailValid(email))false
        else if (!isPasswordValid(password))false
        else if (!isAddressValid(address))false
        else if (!isAgeValid(age))false
        else true

    }
    fun isLoginValid (login :String):Boolean = (login.length < 20)
    fun isEmailValid (email :String):Boolean = (email.contains("@"))
    fun isPasswordValid (password :String):Boolean = (password.length >= 7)
    fun isAddressValid (address :String):Boolean = (address.contains("Ukraine"))
    fun isAgeValid (age: String) :Boolean= (age.toInt() >= 18)
}