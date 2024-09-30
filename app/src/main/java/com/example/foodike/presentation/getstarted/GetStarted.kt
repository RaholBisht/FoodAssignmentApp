package com.example.foodike.presentation.getstarted

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.foodike.R
import com.example.foodike.presentation.auth.Login_SignUp

class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val buttonGetStarted: Button = findViewById(R.id.button)
        buttonGetStarted.setOnClickListener {
            val intent = Intent(this, Login_SignUp::class.java)
            startActivity(intent)
        }
    }
}