package com.example.testregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ibtSend.setOnClickListener {
         if(DataValidator().checkAll(etLogin.text.toString(),etEmail.text.toString(),etPassword.text.toString(),
                   etAddress.text.toString(),etAge.text.toString()).equals(true))   tvSuccess.visibility = View.VISIBLE
            else tvSuccess.text = "Sorry, your details do not match"
        }

    }
}