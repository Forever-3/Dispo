package com.su.a03_intents

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText

class ProcesarActivity : AppCompatActivity() {

    //Crear las variables.
    private lateinit var lblCedula: EditText
    private lateinit var lblNombre: EditText
    private lateinit var lblSexo: EditText
    private lateinit var lblNacido: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_procesar)

        //controlar si vienen valores nulos. intent.extras trata de darle la variable a id,
        val id = Integer.parseInt(intent.extras!!.get("id")!!.toString())
        val nombre = intent.extras!!.get("nombre")!!.toString()
        val sexo = intent.extras!!.getChar("sexo")
        val nacido = intent.extras!!.get("nacido")!!.toString()

        //Crear exactamente la vista
        lblCedula = findViewById(R.id.lblCedula)
        lblNombre = findViewById(R.id.lblNombre)
        lblSexo = findViewById(R.id.lblSexo)
        lblNacido = findViewById(R.id.lblNacido)

        //Deshabilita que se pueda escribir
        lblCedula.setEnabled(false)
        lblNombre.setEnabled(false)
        lblSexo.setEnabled(false)
        lblNacido.setEnabled(false)

        //Datos que se presentan
        lblCedula.setText(id.toString())
        lblNombre.setText(nombre)
        lblSexo.setText(if (sexo.toString() == "F") "Femenino" else "Masculino")
        lblNacido.setText(nacido)

    }
}