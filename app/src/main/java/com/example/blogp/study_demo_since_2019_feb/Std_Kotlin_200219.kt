package com.example.blogp.study_demo_since_2019_feb

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.blogp.study_demo_since_2019_dec.R
import kotlinx.android.synthetic.main.activity_main.*

class Std_Kotlin_200219 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        //val list = ArrayList<String>()
        //StreamSupport.stream(list.spliterator(),false)

        /* RefStreams.of<String>("hi", "pitter")
             .collect(
                 Collectors.toMap<String, String, String>{
                   ff->""
                 })
 */


        val list: List<String> = listOf("Ann", "John")

        list.groupBy {
            it.length

        }.map {
            it.toPair()
        }.map {

        }

        list.map {
            it
        }

        val sq = list.asSequence()

        val asso = list.associate {
            {} to it
        }


        val map = ArrayList<String>().apply {
            add("a")
            add("b")
            add("c")
            add("d")
            add("f")
            add("g")
        }

        val map2 = ArrayList<String>().apply {
            add("1")
            add("2")
            add("3")
            add("4")
            add("5")
            add("6")
        }

        (6 downTo 0 step 2).map {

        }

        val result = (1..5).associate {

            map2[it] to map2
        }

        result.entries.forEach {
            Log.d(" tag", "${it.key} to ${it.value}"  )
        }

       val k =  map.associateBy ({
           map2
       },{
           it
       })

    }



}
