package com.example.canguro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (4==4 && 5!=5){
            println("Hola como estas")
        }
        //hola como estas
        var hola="hola como estas"
        println("Esto lo hice en cangurito")
        val holacc="sera que si sirve a distancia?"
    }
}