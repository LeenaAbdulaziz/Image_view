package com.example.image_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // var lieaner=findViewById(R.id.LA) as constraintlayout
    }

    fun img1(view: View) {
imageView.setBackgroundResource(R.drawable.day)
    }
    fun img2(view: View) {
        imageView.setBackgroundResource(R.drawable.night)

    }
}