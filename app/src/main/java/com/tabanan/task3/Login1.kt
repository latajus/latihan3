package com.tabanan.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login1.*

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        btn.setOnClickListener {
            val a = user.text.toString()
            if (user.text.toString().isEmpty()) {
                user.setError("Masukkan Username dengan Benar")
            } else if (pass.text.toString().isEmpty()) {
                pass.setError("isi password dengan benar")
            } else if (user.text.toString() !="latajus" && pass.text.toString() != "12345") {
                Toast.makeText(this, "username dan password salah", Toast.LENGTH_LONG)
                    .show()
            }else if (a == "latajus" && pass.text.toString() == "12345") {
             //   startActivity(Intent(this, MainActivity::class.java))
                val data = Intent(this, MainActivity::class.java)
                data.putExtra("username", user.text.toString())
                startActivity(data)
            }
        }
    }
}