package com.petkov.radiobuttons

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var linearLayout: LinearLayout
    lateinit var green: RadioButton
    lateinit var yellow: RadioButton
    lateinit var red: RadioButton
    lateinit var change: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        linearLayout = findViewById(R.id.linearLayout)
        green = findViewById(R.id.radioButtonGreen)
        yellow = findViewById(R.id.radioButtonYellow )
        red = findViewById(R.id.radioButtonRed)
        change = findViewById(R.id.buttonChange)

        change.setOnClickListener {
            if (green.isChecked) {
                linearLayout.setBackgroundColor(Color.GREEN)
            } else if (yellow.isChecked) {
                linearLayout.setBackgroundColor(Color.YELLOW)
            } else if (red.isChecked) {
                linearLayout.setBackgroundColor(Color.RED)
            }
        }
    }
}