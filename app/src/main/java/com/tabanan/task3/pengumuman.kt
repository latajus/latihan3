package com.tabanan.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_listnama.*
import kotlinx.android.synthetic.main.activity_pengumuman.*


class pengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengumuman)

        val berita = listOf<String>(
            "Breaking News",
            "hot issue",
            "tabanan",
            "objek wisata",
            "jalan-jalam",
            "olahraga"
        )

        val tanggal = listOf<String>(
            "211121","201121","211121","211121","211121","211121")


        val image =  intArrayOf(
            R.drawable.restoran,
            R.drawable.taman,
            R.drawable.wantilan,
            R.drawable.toilet,
            R.drawable.artshop,
            R.drawable.parkir
        )
        val pengumuman = AdapterPengumuman(berita,image,tanggal){
            val data = Intent(this,DetailPengumuman::class.java)
            data.putExtra("detail pengumuman", berita.get(it))
            data.putExtra("detail Gambar",image.get(it))
            data.putExtra("detail tanggal", tanggal.get(it))
            startActivity(data)
        }
        rvpengumuman.layoutManager = LinearLayoutManager (this)
        rvpengumuman.adapter = pengumuman
    }
}