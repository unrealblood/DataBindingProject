package com.strength.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.strength.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        val quoteDataBinded = Quote("When you focus on problem, problem grows and when you focus on yourself you grow.", "Shubham Singh")

        binding.quote = quoteDataBinded

        /*
        binding.quoteTextTextViewMA.text = "When you focus on problem, problem grows and when you focus on yourself you grow."
        binding.quoteAuthorTextViewMA.text = "Shubham Singh"
         */
    }
}