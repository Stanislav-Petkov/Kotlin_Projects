package com.petkov.fragmentlifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
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