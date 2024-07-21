package com.petkov.textviews

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var myText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myText = findViewById(R.id.textExample)
        myText?.setTextColor(Color.BLACK)
//        myText?.text = "Hello, Kotlin!"
        myText?.text = "Hello, Kotlin!"
        myText?.setOnClickListener {
            myText?.setTextColor(Color.WHITE)
            myText!!.setBackgroundColor(Color.BLACK)
        }
    }
}