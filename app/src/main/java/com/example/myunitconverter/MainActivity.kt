package com.example.myunitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this,KiloToPound::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this,KiloToGram::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this,PoundToGram::class.java)
            startActivity(intent)
        }
    }
}