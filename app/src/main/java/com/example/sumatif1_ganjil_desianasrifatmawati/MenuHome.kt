package com.example.sumatif1_ganjil_desianasrifatmawati

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MenuHome : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_home)

        recyclerView = findViewById(R.id.)
        val data = ArrayList<DataGambar>()
        data.add(DataImage(R.drawable.jurusan,))
    }
}