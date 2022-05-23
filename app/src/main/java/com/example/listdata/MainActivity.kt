package com.example.listdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ArrayList<Model>()
        model.add(Model("saurabh","23","MCA","7am to 8am"))
        model.add(Model("Rajesh","20","BCA","7am to 9am"))
        model.add(Model("Sunny","00","MTECH","8am to 4pm"))
        model.add(Model("Bora","2","MCA","9am to 4pm"))
        model.add(Model("Rutuja","3","MCA","9am to 10am"))

        val recyclerView = findViewById<RecyclerView>(R.id.recycle)
        val myadapter = MyAdapter(model)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= myadapter
    }
}