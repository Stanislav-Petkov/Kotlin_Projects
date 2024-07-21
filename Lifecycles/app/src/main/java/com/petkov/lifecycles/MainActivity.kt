package com.petkov.lifecycles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button1: Button
    lateinit var button2: Button
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button1.setOnClickListener {
            counter = counter + 1
            textView.text = counter.toString()

        }
        button2.setOnClickListener {
            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
        Log.d("Message", "First Activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "First Activity onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "First Activity onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "First Activity onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "First Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "First Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "First Activity onRestart")
    }
}