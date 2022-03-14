package com.example.calculatoersimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculatoersimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnplu.setOnClickListener {
            val num1=binding.firstnumber.text.toString().toDouble()
            val num2= binding.socondnumber.text.toString().toDouble()
            val pul=num1+num2
            Toast.makeText(this,"The resulting =$pul",Toast.LENGTH_LONG).show()
        }
        binding.ptnsub.setOnClickListener {
            val num1=binding.firstnumber.text.toString().toDouble()
            val num2= binding.socondnumber.text.toString().toDouble()
            val sub= num1-num2
            Toast.makeText(this,"The resulting =$sub",Toast.LENGTH_LONG).show()

        }
        binding.ptnmult.setOnClickListener {
            val num1=binding.firstnumber.text.toString().toDouble()
            val num2= binding.socondnumber.text.toString().toDouble()
            val mult = num1*num2
            Toast.makeText(this,"The resulting =$mult",Toast.LENGTH_LONG).show()

        }

    }
}