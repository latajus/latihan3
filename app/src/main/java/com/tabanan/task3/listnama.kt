package com.tabanan.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_listnama.*

class listnama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listnama)

        val names = listOf<String>(
            "Restoran",
            "taman",
            "sarana",
            "toilet",
            "Art Shop",
            "Parkir"

        )
//       val tanggal = listOf<String>(
//            "perempuan","perempuan","laki-laki","perempuan",
//            "laki-laki","laki-laki","laki-laki"
//        )

        val image =  intArrayOf(
            R.drawable.restoran,
            R.drawable.taman,
            R.drawable.wantilan,
            R.drawable.toilet,
            R.drawable.artshop,
            R.drawable.parkir

        )
        val adapternama = AdapterNama(names,image)
        rvnama.layoutManager = LinearLayoutManager (this)
        rvnama.adapter = adapternama
    }
}