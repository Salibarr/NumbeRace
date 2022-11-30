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
        val username1=findViewById<EditText>(R.id.username1)
        val email1=findViewById<EditText>(R.id.email1)
        cntbtn.setOnClickListener {
            if(username1.text.isEmpty() || email1.text.isEmpty())
            {
                Toast.makeText(this, "Enter Information!", Toast.LENGTH_SHORT).show()
            } else{
                intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("username123", username1.getText().toString())
                startActivity(intent)
            }
        }
    }
}