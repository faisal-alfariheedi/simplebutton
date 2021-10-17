package com.example.simplebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var kbut: Button
    lateinit var xbut: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kbut=findViewById(R.id.kbut)
        xbut = findViewById(R.id.xbut)
        kbut.setOnClickListener{
            Toast.makeText(this,"kotlin button was clicked",Toast.LENGTH_SHORT).show()
        }

    }

    fun xbutclick(view: android.view.View) {
        Toast.makeText(this,"xml button was clicked",Toast.LENGTH_SHORT).show()
    }
}