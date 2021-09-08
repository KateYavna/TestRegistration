package com.example.testregistration

import org.junit.Assert
import org.junit.Test

class TestDataValidator {
    @Test
    fun isLoginCorrect(){
        Assert.assertEquals(true,DataValidator().isLoginValid("lusia"))
    }
    @Test
    fun isEmailCorrect(){
        Assert.assertEquals(true,DataValidator().isEmailValid("lusia68@gmail.com"))
    }
    @Test
    fun isPasswordCorrect(){
        Assert.assertEquals(true,DataValidator().isPasswordValid("1234567"))
    }
    @Test
    fun isAddressCorrect(){
        Assert.assertEquals(true,DataValidator().isAddressValid("Ukraine, Kyiv, Academic Vernadskyi pr. 25/8"))
    }
    @Test
    fun isAgeCorrect(){
        Assert.assertEquals(true,DataValidator().isAgeValid("53"))
    }
}