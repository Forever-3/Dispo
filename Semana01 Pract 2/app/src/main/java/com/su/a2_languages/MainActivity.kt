package com.su.a2_languages

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btn_show:  Button = findViewById(R.id.btn_show)
        var btn_shop:  Button = findViewById(R.id.btn_shop)
        var btn_print: Button = findViewById(R.id.btn_print)
        var btn_su: Button = findViewById(R.id.btn_su)

        btn_show.setOnClickListener {
            Toast.makeText(this,R.string.msg_show ,Toast.LENGTH_SHORT).show()
        }

        btn_shop.setOnClickListener {
            Toast.makeText(this,R.string.msg_shop,Toast.LENGTH_SHORT).show()
        }

        btn_print.setOnClickListener {
            Toast.makeText(this,R.string.msg_print,Toast.LENGTH_SHORT).show()
        }

        btn_su.setOnClickListener {
            Toast.makeText(this,R.string.msg_su,Toast.LENGTH_LONG).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}