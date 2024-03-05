package com.example.myapplication.ui.login

import android.widget.Button
import android.widget.EditText
import android.content.Context

class LoginAdapter(private val context: Context) {
    fun login(usernameInput: EditText, passwordInput: EditText, loginBtn: Button){
        // Now you have access to your EditText and Button, you can perform actions as needed
        val username = usernameInput.text.toString()
        val password = passwordInput.text.toString()

        // Perform login.xml.xml action with username and password
    }
}