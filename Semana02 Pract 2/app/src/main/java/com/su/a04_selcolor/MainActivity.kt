package com.su.a04_selcolor

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.app.Activity
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

const val colorIntent = 1
const val colorNombre = "Nombre del color"
const val colorValor = "Color";


class MainActivity : AppCompatActivity() {


    private lateinit var btnElejir: Button
    private lateinit var lblColor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnElejir = findViewById(R.id.btnElejir)
        lblColor = findViewById(R.id.lblColor)

        btnElejir.setOnClickListener {
            Intent(this, SelcolorActivity::class.java).also {
                    colorSeleccionado -> startActivityForResult(colorSeleccionado, colorIntent)
            }
        }



    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // validate control variables
        if(requestCode == colorIntent && resultCode == Activity.RESULT_OK){

            //retrive data color from data extra fields
            val colorFavoritoV = data?.getIntExtra(colorValor,R.color.white)?:R.color.white
            val colorFavoritoN = data?.getStringExtra(colorNombre)?:""

            //color chosen message and color, set visible at true
            lblColor.text = getString(R.string.lblcolor, colorFavoritoN)
            lblColor.setBackgroundResource(colorFavoritoV)
            lblColor.isVisible = true
        }
    }


}