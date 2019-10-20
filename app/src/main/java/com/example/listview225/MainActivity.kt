package com.example.listview225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<model>()

        list.add(model("Ruby", "Ruby is on open-source", R.drawable.rubie))
        list.add(model("Rails", "Ruby is on Rails is a server side web application", R.drawable.railse))
        list.add(model("Phyton", "pyton is enterprised scripting", R.drawable.pyton))
        list.add(model("Javascript", "JavaScript is an objectived scripting", R.drawable.logojs))
        list.add(model("PHP", "PHP is an interprised language le, there is no need for", R.drawable.phpe))

        listview.adapter = adapterlist(this, R.layout.row, list)

        listview.setOnItemClickListener { parent, view, position, id ->

            if (position == 0) {
                Toast.makeText(this@MainActivity, "Item One",   Toast.LENGTH_SHORT).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "Item Two",   Toast.LENGTH_SHORT).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity, "Item Three",   Toast.LENGTH_SHORT).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivity, "Item Four",   Toast.LENGTH_SHORT).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivity, "Item Five",   Toast.LENGTH_SHORT).show()

            }
        }
    }
}
