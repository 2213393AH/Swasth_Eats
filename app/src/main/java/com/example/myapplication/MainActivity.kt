package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.buttonLogin)
        val signUpButton = findViewById<Button>(R.id.buttonSignUp)

        loginButton.setOnClickListener {
            // Handle login logic (validate credentials, etc.)
            // For demonstration purposes, assume login is successful
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener {
            // Redirect to SignUpActivity when Sign Up button is clicked
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
