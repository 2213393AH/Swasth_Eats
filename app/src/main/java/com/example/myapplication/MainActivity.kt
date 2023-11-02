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
        loginButton.setOnClickListener {
            // Replace the following placeholder logic with your actual authentication logic
            val username = "user123"
            val password = "password123"
            val enteredUsername = findViewById<EditText>(R.id.editTextUsername).text.toString()
            val enteredPassword = findViewById<EditText>(R.id.editTextPassword).text.toString()

            if (enteredUsername == username && enteredPassword == password) {
                // Authentication successful, redirect to HomeActivity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Close the login activity to prevent going back on pressing back button
            } else {
                // Authentication failed, show error message (you can customize this part)
                Toast.makeText(this, "Invalid credentials. Please try again.", Toast.LENGTH_SHORT)
                    .show()
            }
                    val loginButton = findViewById<Button>(R.id.buttonLogin)
                    val signUpButton = findViewById<Button>(R.id.buttonSignUp)

                    loginButton.setOnClickListener {
                        // Handle login logic (same as before)
                    }

                    signUpButton.setOnClickListener {
                        // Redirect to SignUpActivity when Sign Up button is clicked
                        val intent = Intent(this, SignUpActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

        }
    }
}
