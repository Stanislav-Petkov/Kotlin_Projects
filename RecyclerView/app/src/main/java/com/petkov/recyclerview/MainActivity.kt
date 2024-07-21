package com.petkov.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var countryNameList : ArrayList<String> = ArrayList()
    var detailsList: ArrayList<String> = ArrayList()
    var imageList: ArrayList<Int> = ArrayList()

    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("Uk")
        countryNameList.add("USA")

        detailsList.add("United Kingdom")
        detailsList.add("United States of America")

        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.usa)

        adapter = CountriesAdapter(countryNameList, detailsList, imageList, this@MainActivity)
        recyclerView.adapter = adapter

    }
}