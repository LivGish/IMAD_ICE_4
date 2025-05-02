package com.example.ice4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Summary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_summary)

        val txtDisplay2 = findViewById<TextView>(R.id.txtDisplay2)

        val reviewQuiz = findViewById<Button>(R.id.reviewQuiz)

        val btnClose = findViewById<Button>(R.id.exitApp)

        //get score variable from previous screen
        var score = intent.getIntExtra("score", 0)

        txtDisplay2.text = "Your final score is $score / 5"

        if (score == 4 || score == 5) {
            txtDisplay2.text = "You're a movie genius!"
        } else if (score == 3 || score == 2) {
            txtDisplay2.text = "Not bad! Keep watching."
        } else if (score == 1 || score == 0) {
            txtDisplay2.text = "Time to binge a classic!"
        }

        reviewQuiz.setOnClickListener{
            txtDisplay2.text = """
                Donna's band is called 'Donna and the Dynamos'. = true
                Sophie has two potential fathers. = false
                The movie is set in Spain. = false
                The soundtrack is based off of songs from Abba. = true
                Sophie gets married at the end of the film. = false
            """.trimIndent()
        }

        btnClose.setOnClickListener{
            finishAffinity()
        }

    }
}