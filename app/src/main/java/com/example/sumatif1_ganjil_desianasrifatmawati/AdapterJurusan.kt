package com.example.sumatif1_ganjil_desianasrifatmawati

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterJurusan (private val dataset:ArrayList<DataGambar>)
    :RecyclerView.Adapter<AdapterJurusan.ViewHolder> () {
    class ViewHolder (view: View):RecyclerView.ViewHolder(view){
        var foto :ImageView = view.findViewById(R.id.Gambar)
        var jurusan : TextView = view.findViewById(R.id.jurusan)
        var textJurusan : TextView = view.findViewById(R.id.textJurusan)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflate = LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter_jurusan,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataGambar = dataset[position]
        holder.foto.setImageResource(DataGambar.gambar)
        holder.jurusan.text = DataGambar.jurusan
        holder.textJurusan.text = DataGambar.nama_jurusan
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}