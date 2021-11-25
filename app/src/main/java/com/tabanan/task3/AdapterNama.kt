package com.tabanan.task3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_nama.view.*

class AdapterNama(private val listname : List<String>, private val image : IntArray):RecyclerView.Adapter<AdapterNama.ViewHolder>() {
    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
         val nama = view.itemnama
       //  val tanggal = view.itemtanggal
        val img = view.itemgambar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNama.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_nama,parent,false)
        )
    }

    override fun onBindViewHolder(holder: AdapterNama.ViewHolder, position: Int) {
       //val data = listname.get(position)
        holder.nama.text = listname[position]
       // holder.tanggal.text = tgl[position]
        holder.img.setImageResource(image[position])

    }

    override fun getItemCount(): Int {
        return listname.size
    }
}