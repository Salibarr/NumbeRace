package com.example.numberace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cntbtn=findViewById<TextView>(R.id.cntbtn)
        val username=findViewById<EditText>(R.id.username1)
        val email=findViewById<EditText>(R.id.email1)
        cntbtn.setOnClickListener {
            if(username.text.isEmpty() || email.text.isEmpty()) {
                Toast.makeText(this, "Enter Information!", Toast.LENGTH_SHORT).show()
            }
            cntbtn.setOnClickListener {
                startActivity(Intent(this, MainActivity2::class.java))
            }
        }
    }
}