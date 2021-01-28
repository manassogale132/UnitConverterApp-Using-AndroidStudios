package com.example.myunitconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kilotogram.*
import kotlinx.android.synthetic.main.activity_kilotogram.buttonConvert
import kotlinx.android.synthetic.main.activity_kilotogram.editTextToEnterKilogram1
import kotlinx.android.synthetic.main.activity_kilotopound.*

class KiloToGram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kilotogram)

        buttonConvert.setOnClickListener {
            ConvertFromKiloToGrams()
        }
    }

    fun ConvertFromKiloToGrams(){
        val input = editTextToEnterKilogram1.text.toString()
        var kilo : Int? = input.toInt()
        var grams = kilo?.times(1000)
        textViewConvertedGrams.setText("" + grams)
    }
}