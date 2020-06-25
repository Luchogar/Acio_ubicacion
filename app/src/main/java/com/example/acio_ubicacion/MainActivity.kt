package com.example.acio_ubicacion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var mBoton: Button
    lateinit var mBuscar:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBoton=findViewById(R.id.bMapa)
        mBuscar=findViewById(R.id.eTexto1)
        var longitud:Double = 19.50341273825985
        var latitud:Double = -99.13389399231987



        mBoton.setOnClickListener {
            //val mUrlIntent = Uri.parse("geo:0,0?q=${mBuscar.text.toString()}")
            //val mUrlIntent = Uri.parse("geo:37.7749,-122.4194")
            val mUrlIntent = Uri.parse("geo:0,0?q=${latitud},${longitud}")

            val mMapIntent = Intent(Intent.ACTION_VIEW,mUrlIntent)
            mMapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mMapIntent)
        }

    }
}
