package com.tabanan.task3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_listnama.*
import kotlinx.android.synthetic.main.activity_pengumuman.*
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bro.text = param1

        val berita = listOf<String>(
            "Restoran",
            "taman",
            "sarana",
            "toilet",
            "Art Shop",
            "Parkir"
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
            val data = Intent(context,DetailPengumuman::class.java)
            data.putExtra("detail pengumuman", berita.get(it))
            data.putExtra("detail Gambar",image.get(it))
            data.putExtra("detail tanggal", tanggal.get(it))
            startActivity(data)
        }
        rvhome.layoutManager = LinearLayoutManager (context)
        rvhome.adapter = pengumuman

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String) =
            FragmentHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                                    }
            }
    }
}