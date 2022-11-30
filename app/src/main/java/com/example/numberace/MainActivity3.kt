package com.example.numberace

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val playagain=findViewById<TextView>(R.id.playagain)
        val home=findViewById<TextView>(R.id.home)
        val score=findViewById<TextView>(R.id.score1)
        val scr = intent.getStringExtra("cifri")
        score.setText(scr)

        playagain.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        home.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}