package com.example.wanderingWeatherWheel

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wanderingWeatherWheel.databinding.ActivityMainBinding
import com.example.wanderingWeatherWheel.databinding.MovieViewHolderBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.rv.apply{
            layoutManager = LinearLayoutManager(context,
                RecyclerView.HORIZONTAL,
                false)
            adapter = WeatherAdapter(getImageUris())
        }
    }

    private inner class WeatherViewHolder(private val binding: MovieViewHolderBinding):
            RecyclerView.ViewHolder(binding.root) {}

    private inner class WeatherAdapter(imageUris: MutableList<String>) : RecyclerView.Adapter<WeatherViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
            val binding = DataBindingUtil.inflate<MovieViewHolderBinding>(
                layoutInflater,
                R.layout.movie_view_holder,
                parent,
                false
            )
            return WeatherViewHolder(binding)
        }

        override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
            TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
            TODO("Not yet implemented")
        }

    }

    fun getImageUris(): MutableList<String> {
        var arr = mutableListOf<String>()
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/01n@2x.png")
        arr.add("https://openweathermap.org/img/wn/09n@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/01n@2x.png")
        arr.add("https://openweathermap.org/img/wn/09n@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/01n@2x.png")
        arr.add("https://openweathermap.org/img/wn/09n@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/01n@2x.png")
        arr.add("https://openweathermap.org/img/wn/09n@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/10d@2x.png")
        arr.add("https://openweathermap.org/img/wn/01n@2x.png")
        arr.add("https://openweathermap.org/img/wn/09n@2x.png")
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
        arr.add("SHOOT")
        arr.add("BROUHAHA")
        arr.add("LALALA")
        arr.add("DOMINANCE")

        return arr
    }

}