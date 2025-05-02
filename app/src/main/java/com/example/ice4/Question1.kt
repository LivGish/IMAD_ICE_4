package com.example.ice4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Question1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question1)

        //declare variables to be used in the code
        val txtDisplay = findViewById<TextView>(R.id.txtDisplay2)

        //declare variables to be used in the code
        val btnNext = findViewById<Button>(R.id.btnNext)

        //declare variables to be used in the code
        val btnTrue = findViewById<Button>(R.id.btnTrue)

        //declare variables to be used in the code
        val btnFalse = findViewById<Button>(R.id.btnFalse)

        val questions = arrayOf("Question 1", "Question 2", "Question 3", "Question 4", "Question 5")

    }
}