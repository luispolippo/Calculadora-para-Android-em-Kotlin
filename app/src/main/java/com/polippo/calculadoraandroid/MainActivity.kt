package com.polippo.calculadoraandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number0 = findViewById<Button>(R.id.button_number0)
        val number1 = findViewById<Button>(R.id.button_number1)
        val number2 = findViewById<Button>(R.id.button_number2)
        val number3 = findViewById<Button>(R.id.button_number3)
        val number4 = findViewById<Button>(R.id.button_number4)
        val number5 = findViewById<Button>(R.id.button_number5)
        val number6 = findViewById<Button>(R.id.button_number6)
        val number7 = findViewById<Button>(R.id.button_number7)
        val number8 = findViewById<Button>(R.id.button_number8)
        val number9 = findViewById<Button>(R.id.button_number9)
        val btnPlus = findViewById<Button>(R.id.button_plus)
        val btnMinus = findViewById<Button>(R.id.button_minus)
        val btnMultiplication = findViewById<Button>(R.id.button_multiplication)
        val btnDivision = findViewById<Button>(R.id.button_division)
        val btnBack = findViewById<Button>(R.id.button_back)
        val btnResult = findViewById<Button>(R.id.button_result)
        val textViewInput = findViewById<TextView>(R.id.textView_input)

        number0.setOnClickListener {
            textViewInput.append(number0.text)
        }

        number1.setOnClickListener {
            textViewInput.append(number1.text)
        }

        number2.setOnClickListener {
            textViewInput.append(number2.text)
        }

        number3.setOnClickListener {
            textViewInput.append(number3.text)
        }

        number4.setOnClickListener {
            textViewInput.append(number4.text)
        }

        number5.setOnClickListener {
            textViewInput.append(number5.text)
        }

        number6.setOnClickListener {
            textViewInput.append(number6.text)
        }

        number7.setOnClickListener {
            textViewInput.append(number7.text)
        }

        number8.setOnClickListener {
            textViewInput.append(number8.text)
        }

        number9.setOnClickListener {
            textViewInput.append(number9.text)
        }
    }
}