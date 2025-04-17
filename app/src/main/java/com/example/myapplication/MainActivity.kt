package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","OnCreate called")

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener{
            Log.d("MainActivity","Button clicked")
            // Вираз 1
            val a1 = 10
            val b1 = 20
            val c1 = 5
            val result1 = (a1+b1-c1)*2/3%5

            // Вираз 2
            val a2 = 7
            val b2 = 120
            val c2 = 5
            val d2 = 17
            val result2 = (a2+b2+c2-d2)*2/3%5+c2

            // Вираз 3
            val a3 = 5
            val b3 = 3
            val c3 = 2
            val d3 = 4
            val result3 = ((a3-b3)*c3)*d3*2+a3%d3-(c3 * d3)

            // Вираз 4
            val a4 = 7
            val b4 = 120
            val c4 = 15
            val result4 = (2*a4+3*b4-4*c4)*12/a4%3

            // Вираз 5
            val a5 = 18
            val b5 = 15
            val c5 = 120
            val result5 = (7*a5+3*b5-6*c5)/((a5-b5)*c5)

            // Виведення результатів
            val resultText = """
        1) (a1+b1-c1)*2/3%5 = $result1
        2) (a2+b2+c2-d2)*2/3%5+c2 = $result2
        3) ((a3-b3)*c3)*d3*2+a3%d3-(c3 * d3) = $result3
        4) (2*a4+3*b4-4*c4)*12/a4%3 = $result4
        5) (7*a5+3*b5-6*c5)/((a5-b5)*c5) = $result5
    """.trimIndent()

            textView.text = resultText
        }
        }
    }
