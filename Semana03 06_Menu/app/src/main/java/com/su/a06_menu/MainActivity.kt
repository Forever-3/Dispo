package com.su.a06_menu

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var layoutView: ConstraintLayout
    private lateinit var toolbar: MaterialToolbar
    private lateinit var lblGreeting : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        layoutView = findViewById(R.id.layoutView)
        lblGreeting = findViewById(R.id.greeting)
        setSupportActionBar(toolbar)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
        //return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_red -> {
                item.isChecked = !item.isChecked
                layoutView.setBackgroundColor(android.graphics.Color.RED)
                lblGreeting.setTextColor(android.graphics.Color.WHITE)
                return true
            }
            R.id.menu_green -> {
                item.isChecked = !item.isChecked
                layoutView.setBackgroundColor(android.graphics.Color.GREEN)
                lblGreeting.setTextColor(android.graphics.Color.BLACK)
                return true
            }
            R.id.menu_yellow -> {
                item.isChecked = !item.isChecked
                layoutView.setBackgroundColor(android.graphics.Color.YELLOW)
                lblGreeting.setTextColor(android.graphics.Color.BLACK)
                return true
            }
            R.id.menu_blue -> {
                item.isChecked = !item.isChecked
                layoutView.setBackgroundColor(android.graphics.Color.BLUE)
                lblGreeting.setTextColor(android.graphics.Color.WHITE)
                return true
            }
            R.id.menu_black -> {
                item.isChecked = !item.isChecked
                layoutView.setBackgroundColor(android.graphics.Color.BLACK)
                lblGreeting.setTextColor(android.graphics.Color.WHITE)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}