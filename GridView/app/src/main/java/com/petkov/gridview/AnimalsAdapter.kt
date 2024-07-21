package com.petkov.gridview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AnimalsAdapter(
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context
) : BaseAdapter() {


    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(parent?.context)
            .inflate(R.layout.custom_layout, parent, false)

        val animalName: TextView = view.findViewById(R.id.textView)
        val animalImage: ImageView = view.findViewById(R.id.imageView)

        animalName.text = nameList[position]
        animalImage.setImageResource(imageList[position])
        return view
    }

}