package com.petkov.togglebutton

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var image: ImageView
    lateinit var result: TextView
    lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        image = findViewById(R.id.image)
        result = findViewById(R.id.result)
        toggleButton = findViewById(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener{
                _, isChecked ->
            if(isChecked){
                image.visibility = View.INVISIBLE
                result.text = "The image is invisible"
            } else {
                image.visibility = View.VISIBLE
                result.text = "The image is visible"
            }
        }
    }
}