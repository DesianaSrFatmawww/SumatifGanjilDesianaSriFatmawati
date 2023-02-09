package com.example.sumatif1_ganjil_desianasrifatmawati

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Jurusan : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jurusan)

        recyclerView = findViewById(R.id.listDataJurusan)
        val data = ArrayList<DataGambar>()
        data.add(DataGambar(R.drawable.image1,"RPL","(Rekayasa Perangkat Lunak"))
        data.add(DataGambar(R.drawable.image2,"TKJ","(Teknik Komputer dan Jaringan"))
        data.add(DataGambar(R.drawable.image3,"TB","(Teknik Busana"))
        data.add(DataGambar(R.drawable.image4,"TKR","(Teknik Kendaraan Ringan"))
        data.add(DataGambar(R.drawable.image5,"TSM","(Teknik Sepeda Motor"))


        //Menambahkan data ke dalam adapter
        recyclerAdapter = AdapterJurusan(data)
        //Menambahkan Layout Manager
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //Memanggil Adapter
        recyclerView.adapter = recyclerAdapter
        //Menampilkan data ke Layout
        recyclerView.layoutManager = layoutManager

    }
}