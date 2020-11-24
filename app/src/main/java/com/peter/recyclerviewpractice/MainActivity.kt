package com.peter.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peter.recyclerviewpractice.data.Dictionary

class MainActivity : AppCompatActivity() {


    var wordsList = arrayListOf<Dictionary>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}