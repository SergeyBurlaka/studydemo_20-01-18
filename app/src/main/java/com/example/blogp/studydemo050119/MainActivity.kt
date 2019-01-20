package com.example.blogp.studydemo050119

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_demo_1)

        var (age, name) = Pair(1,true)
        age = 4
    }
}
