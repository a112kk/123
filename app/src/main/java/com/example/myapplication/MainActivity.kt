package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.component1
import java.util.Scanner

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rootLoay: ConstraintLayout = findViewById(R.id.root_loya)
        var textView: TextView = findViewById(R.id.textView)
        var button: Button = findViewById(R.id.button)
        var button2: Button = findViewById(R.id.button2)
        var button3: Button = findViewById(R.id.button3)
        button.setOnClickListener {
            textView.text = "Красный"
            rootLoay.setBackgroundColor(resources.getColor(R.color.red))
            button.setBackgroundColor(resources.getColor(R.color.white))
            button2.setBackgroundColor(resources.getColor(R.color.yellow))
            button3.setBackgroundColor(resources.getColor(R.color.green))


        }
        button2.setOnClickListener {
            textView.text = "Желтый"
            rootLoay.setBackgroundColor(resources.getColor(R.color.yellow))
            button2.setBackgroundColor(resources.getColor(R.color.white))
            button.setBackgroundColor(resources.getColor(R.color.red))
            button3.setBackgroundColor(resources.getColor(R.color.green))

        }
        button3.setOnClickListener {
            textView.text = "Зеленый"
            rootLoay.setBackgroundColor(resources.getColor(R.color.green))
            button3.setBackgroundColor(resources.getColor(R.color.white))
            button.setBackgroundColor(resources.getColor(R.color.red))
            button2.setBackgroundColor(resources.getColor(R.color.yellow))
        }

    }
}