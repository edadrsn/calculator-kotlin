package com.example.kotlincalculator

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    fun add(view:View){

    }

    fun sub(view:View){

       
    }
    fun mult(view:View){

    }

    fun div(view:View){


    }

    fun reset(view:View){
        binding.numOne.setText("")
        binding.numTwo.setText("")
        binding.txtResult.setText("")

    }
}