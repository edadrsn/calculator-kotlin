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
    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun add(view: View) {
        number1 = binding.numOne.text.toString().toDoubleOrNull()
        number2 = binding.numTwo.text.toString().toDoubleOrNull()
        if(number1!=null && number2!=null){
            result=number1!!+number2!!
            binding.txtResult.text="RESUL: $result"
        }
        else{
            Toast.makeText(this,"Don't leave empty numbers",Toast.LENGTH_SHORT).show()
        }
    }

    fun sub(view: View) {
        number1=binding.numOne.text.toString().toDoubleOrNull()
        number2=binding.numTwo.text.toString().toDoubleOrNull()
        if(number1!=null && number2!=null){
            result=number1!!-number2!!
            binding.txtResult.text="RESULT: $result"
        }


    }

    fun mult(view: View) {

    }

    fun div(view: View) {


    }

    fun reset(view: View) {
        binding.numOne.setText("")
        binding.numTwo.setText("")
        binding.txtResult.setText("")

    }
}