package com.example.a12032023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val planetaTierra = universo("Tierra",9.8f)
        println( "El planeta ${planetaTierra.planeta} rota a una velocidad de ${planetaTierra.velocidad()}")


    }



}

 private class universo(var planeta: String, var gravedad: Float){

       var velocidad : Float = 5.0F

     fun velocidad (): Float {
         calcularVelocidad ()
         return velocidad
     }

     private fun calcularVelocidad (){

         velocidad = (velocidad * gravedad)

     }


}