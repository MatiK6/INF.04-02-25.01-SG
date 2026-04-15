package com.example.inf04_02_2501_sg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var odkurzaczWlaczony = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // PRALKA
        val editText = findViewById<EditText>(R.id.etWashingProgram)
        val buttonPralka = findViewById<Button>(R.id.button)
        val textPralka = findViewById<TextView>(R.id.textView)

        buttonPralka.setOnClickListener {
            val input = editText.text.toString()

            if (input.isNotEmpty()) {
                val number = input.toInt()

                if (number in 1..12) {
                    textPralka.text = "Numer prania: $number"
                }
            }
        }

        // ODKURZACZ
        val buttonOdkurzacz = findViewById<Button>(R.id.button2)
        val textOdkurzacz = findViewById<TextView>(R.id.textView10)

        buttonOdkurzacz.setOnClickListener {
            odkurzaczWlaczony = !odkurzaczWlaczony

            if (odkurzaczWlaczony) {
                buttonOdkurzacz.text = "Wyłącz"
                textOdkurzacz.text = "Odkurzacz włączony"
            } else {
                buttonOdkurzacz.text = "Włącz"
                textOdkurzacz.text = "Odkurzacz wyłączony"
            }
        }
    }
}