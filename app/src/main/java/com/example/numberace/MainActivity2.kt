package com.example.numberace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val username2=findViewById<TextView>(R.id.username2)
        val email2=findViewById<TextView>(R.id.email2)
        val ricxvi=findViewById<TextView>(R.id.number)
        val tap=findViewById<TextView>(R.id.tap)
        val back=findViewById<TextView>(R.id.back)
        val finish=findViewById<TextView>(R.id.finish)
        val str =intent.getStringExtra("username123")
        username2.setText(str)


        tap.setOnClickListener {
            var number=ricxvi.text.toString().toInt()
            number++
            ricxvi.text=number.toString()
        }
        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        finish.setOnClickListener {
//            startActivity(Intent(this, MainActivity3::class.java))
            intent=Intent(this, MainActivity3::class.java)
            intent.putExtra("cifri", ricxvi.getText().toString())
            startActivity(intent)
        }
    }
}