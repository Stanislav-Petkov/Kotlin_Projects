package com.petkov.listview

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        listView = findViewById(R.id.listView)
        var countryList = resources.getStringArray(R.array.countries)
        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryList)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, _, position, _ ->
            val countryName: String = parent.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext, "You selected $countryName", Toast.LENGTH_SHORT)
                .show()
        }

//        listView.setOnItemClickListener { parent, view, position, id ->
//            val selectedItem = parent.getItemAtPosition(position) as String
//            val selectedItemPosition = parent.getItemIdAtPosition(position)
//            println("Selected item: $selectedItem")
//            println("Selected item position: $selectedItemPosition")
//        }
    }
}