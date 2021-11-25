package com.tabanan.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_pengumuman.*

class DetailPengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengumuman)

        val datanama = intent.getStringExtra("detail pengumuman")
        val datagambar= intent.getIntExtra("detail Gambar",0)
        val datatanggal= intent.getStringExtra("detail tanggal")


        detailnama.text = datanama.toString()
        detailgambar.setImageResource(datagambar)
        detailtanggal.text = datatanggal.toString()

    }
}