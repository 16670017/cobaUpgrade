package com.example.coba.dadu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val putarButton: Button = findViewById(R.id.bt1)
        putarButton.setOnClickListener {
            kocokDadu()

        }
    }

    private fun kocokDadu() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.a
            2 -> R.drawable.b
            3 -> R.drawable.c
            4 -> R.drawable.d
            5 -> R.drawable.e
            else -> R.drawable.f
        }
        val diceImage: ImageView = findViewById(R.id.dice_image)
        dice_image.setImageResource(drawableResource)
    }
}
