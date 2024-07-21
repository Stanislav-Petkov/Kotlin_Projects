package com.petkov.checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var male: CheckBox
    lateinit var female: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textView = findViewById(R.id.textViewResult)
        male = findViewById(R.id.checkBoxMale)
        female = findViewById(R.id.checkBoxFemale)

        male.setOnClickListener{
            if(male.isChecked){
                textView.text = "Your gender is male"
                female.isChecked = false
            }else{
                textView.text = "What is your gender?"
            }
        }

        female.setOnClickListener{
            if(female.isChecked) {
                textView.text = "Your gender is female"
                male.isChecked = false
            }else {
                textView.text = "What is your gender?"
            }
        }
    }
}