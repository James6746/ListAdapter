package com.example.listadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvMain: RecyclerView
    lateinit var adapter: MListAdapter
    val list = ArrayList<Contact>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain = findViewById(R.id.rv_main)
        rvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        for(i in 1..20){
            list.add(Contact(i, R.drawable.ic_launcher_foreground, "James"))
        }

        adapter = MListAdapter(list)
        rvMain.adapter = adapter
        adapter.submitList(list)


    }
}