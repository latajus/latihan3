package com.tabanan.task3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_nama.view.*
import kotlinx.android.synthetic.main.item_nama.view.itemgambar
import kotlinx.android.synthetic.main.listpengumuman.view.*

class AdapterPengumuman(private val judul : List<String>, private val image : IntArray,private val tgl : List<String>
, private val onclick : (Int)->Unit):
    RecyclerView.Adapter<AdapterPengumuman.ViewHolder>() {
    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val nama = view.berita
        val tanggal = view.itemtanggal
        val img = view.itemgambar

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): AdapterPengumuman.ViewHolder {
        return AdapterPengumuman.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.listpengumuman, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AdapterPengumuman.ViewHolder, position: Int) {
        holder.nama.text = judul[position]
        holder.tanggal.text = tgl[position]
        holder.img.setImageResource(image[position])
        holder.itemView.setOnClickListener {
            onclick(position)
        }
    }

    override fun getItemCount(): Int {
        return judul.size
    }

}