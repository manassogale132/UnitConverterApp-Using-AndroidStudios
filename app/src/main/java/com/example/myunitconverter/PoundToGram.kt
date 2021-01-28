package com.example.myunitconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_poundtogram.*

class PoundToGram : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poundtogram)

        buttonConvert.setOnClickListener {
            ConvertFromPoundToGrams()
        }
    }

    fun ConvertFromPoundToGrams(){
        val input = editTextToEnterKilogram1.text.toString()
        var pound : Double? = input.toDouble()
        var grams = pound?.times(453.5)
        textViewConvertedGrams3.setText("" + grams)
    }
}