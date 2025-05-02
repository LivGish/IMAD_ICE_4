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

class Question1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question1)

        //declare variables to be used in the code
        val txtHeading = findViewById<TextView>(R.id.txtHeading2)

        //declare variables to be used in the code
        val txtDisplay = findViewById<TextView>(R.id.txtDisplay2)

        //declare variables to be used in the code
        val btnNext = findViewById<Button>(R.id.btnNext)

        //declare variables to be used in the code
        val btnTrue = findViewById<Button>(R.id.btnTrue)

        //declare variables to be used in the code
        val btnFalse = findViewById<Button>(R.id.btnFalse)

        var counter = 0
        var score = 0

        val headings = arrayOf("Question 1", "Question 2", "Question 3", "Question 4", "Question 5")

        val questions = arrayOf(
            "Donna's band is called 'Donna and the Dynamos'.",
            "Sophie has two potential fathers.",
            "The movie is set in Spain.",
            "The soundtrack is based off of songs from Abba.",
            "Sophie gets married at the end of the film.")

        val answers = arrayOf(true, false, false, true, false)

        while (counter <= 5) {
            txtHeading.text = "${headings[counter]}"
            txtDisplay.text = "${questions[counter]}"
            btnTrue.setOnClickListener{
                if (answers[counter] == true) {
                txtDisplay.text = "Correct!"
                score += 1
            } else {
                txtDisplay.text = "Incorrect!"
                }
            }
            btnFalse.setOnClickListener{
                if (answers[counter] == false) {
                    txtDisplay.text = "Correct!"
                    score += 1
                } else {
                    txtDisplay.text = "Incorrect!"
                }
            }
            btnNext.setOnClickListener{
                counter += 1
            }
        }

        val intent = Intent(this, Summary::class.java)
        intent.putExtra("score", counter)

        //switches to the movie page when the button is clicked
        btnNext.setOnClickListener {
            val intent = Intent(this, Summary::class.java)

            //start Question1, which will open a new screen
            startActivity(intent)
        }

    }
}