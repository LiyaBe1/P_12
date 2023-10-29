package com.example.p_12

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)

        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)
        val imageView7 = findViewById<ImageView>(R.id.imageView7)

        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)


        radioButton1.setOnClickListener {
            imageView.setImageResource(R.drawable.j)
        }

        radioButton2.setOnClickListener {
            imageView.setImageResource(R.drawable.m)
        }

        radioButton3.setOnClickListener {
            imageView.setImageResource(R.drawable.r)
        }
        checkBox1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                imageView5.visibility = View.GONE
            } else {
                imageView5.visibility = View.VISIBLE
            }

            checkBox2.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    imageView6.visibility = View.GONE
                } else {
                    imageView6.visibility = View.VISIBLE
                }

                checkBox3.setOnCheckedChangeListener { _, isChecked ->
                    if (isChecked) {
                        imageView7.visibility = View.GONE
                    } else {
                        imageView7.visibility = View.VISIBLE
                    }
                }
            }
        }
    }
}
