package com.example.blogp.study_demo_since_2019_dec

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_animation_demo.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_demo)

        AnimationUtils.loadAnimation(this, R.anim.text_animation).also {
            textView6.startAnimation(it)
        }


    }
}
