package com.example.numberace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val user=findViewById<TextView>(R.id.username2)
        val email=findViewById<TextView>(R.id.email2)
        val ricxvi=findViewById<TextView>(R.id.number)
        val tap=findViewById<TextView>(R.id.tap)
        val back=findViewById<TextView>(R.id.back)
        val finish=findViewById<TextView>(R.id.finish)

        tap.setOnClickListener {
            var number=ricxvi.text.toString().toInt()
            number++
            ricxvi.text=number.toString()
        }
        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        finish.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}