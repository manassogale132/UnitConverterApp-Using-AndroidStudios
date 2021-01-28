package com.example.myunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_kilotopound.*

class KiloToPound : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kilotopound)

        buttonConvert.setOnClickListener {
            ConvertFromKiloToPounds()
        }
    }

    fun ConvertFromKiloToPounds(){
        val input = editTextToEnterKilogram.text.toString()
        //Kotlin convert String to Double
        var kilo : Double? = input.toDouble()
        //converting kilo to pounds
        var pounds = kilo?.times(2.205)
        textViewConvertedPounds.setText("" + pounds)
    }
}