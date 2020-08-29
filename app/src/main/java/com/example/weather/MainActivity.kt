package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val inputFragment = InputFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, inputFragment)
                .commit()
        }
    }
}