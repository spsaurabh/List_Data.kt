package com.example.listdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val actionBar : ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val textView1:TextView = findViewById(R.id.textName)
        val textView2:TextView = findViewById(R.id.textID)
        val textView3:TextView = findViewById(R.id.textCourse)
        val textView4:TextView = findViewById(R.id.textTime)

        val extras = intent.extras
//        if (extras != null)
//        {
//            var n = extras.getString("name").toString()
//            var m = extras.getString("ID").toString()
//            var o = extras.getString("course").toString()
//            var p = extras.getString("Time").toString()
//        }
        textView1.text = extras?.getString("name").toString()
        textView2.text = extras?.getString("ID").toString()
        textView3.text = extras?.getString("course").toString()
        textView4.text = extras?.getString("Time").toString()

    }
}