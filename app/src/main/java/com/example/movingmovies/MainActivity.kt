package com.example.movingmovies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arr: MutableList<String> = getImageUris()
        //val arr: MutableList<String> = getDummyStrings()
        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        val dividerItemDecoration = CustomDividerItemDecoration()
        rv?.addItemDecoration(dividerItemDecoration)
        rv.adapter = MoviesRecyclerViewAdapter(arr)
    }

    fun getImageUris(): MutableList<String> {
        var arr = mutableListOf<String>()
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/01n@2x.png")
        arr.add("https://openweathermap.org/img/wn/09n@2x.png")

        return arr
    }

    fun getDummyStrings(): MutableList<String> {
        var arr = mutableListOf<String>()
        arr.add("HELLO")
        arr.add("SHIT")
        arr.add("BROUHAHA")
        arr.add("SEXYAF")
        arr.add("DOMINANCE")

        return arr
    }

}