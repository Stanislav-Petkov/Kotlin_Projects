package com.petkov.edittexts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var ok: Button
    lateinit var result: TextView
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        name = findViewById(R.id.editTextName)
        ok = findViewById(R.id.buttonOk)
        result = findViewById(R.id.result)
        image = findViewById(R.id.imageViewExample)

        ok.setOnClickListener {
            image.setImageResource(R.drawable.second_image)
//            val userName : String = name.text.toString()
//            result.text = userName
        }
    }
}