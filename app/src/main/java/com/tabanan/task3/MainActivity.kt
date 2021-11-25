package com.tabanan.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = intent.getStringExtra("username")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentcontainer,FragmentHome.newInstance("$a")).commit()

        bottomnav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menuhome->{
                 supportFragmentManager.beginTransaction()
                     .replace(R.id.fragmentcontainer,FragmentHome.newInstance("$a")).commit()
                 return@setOnItemSelectedListener true
                }
                R.id.menuweb->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer,FragmentWeb()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menuprofil->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer,FragmentAkun()).commit()
                    return@setOnItemSelectedListener true
                }
            }
            return@setOnItemSelectedListener false
        }
    }
}