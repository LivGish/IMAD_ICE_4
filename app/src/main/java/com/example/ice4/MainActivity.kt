package com.example.ice4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //declare variables to be used in the code
        var txtDisplay = findViewById<TextView>(R.id.txtDisplay)

        //declare variables to be used in the code
        var btnStart = findViewById<Button>(R.id.btnStart)

        //displays the text in green when the app is run
        txtDisplay.text="""
            Welcome to the Mamma Mia quiz!
            The quiz is made up of 5 
            true or false questions based on 
            the musical Mamma Mia.
            Press the start button to start the quiz.
        """.trimIndent()

        //switches to the movie page when the button is clicked
        btnStart.setOnClickListener{

            val intent = Intent (this, Question1::class.java)
            startActivity(intent)

        }

    }
}