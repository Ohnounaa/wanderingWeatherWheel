package com.example.movingmovies

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule;

@GlideModule
class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var movieImg: ImageView = itemView.findViewById<ImageView>(R.id.iv)
    private var movieDesc: TextView =itemView.findViewById<TextView>(R.id.movie_description)

    fun bind(applicationContext: Context, s: String) {
        //movieDesc.text = s


        Glide.with(applicationContext)
            .load(s)
            .into(movieImg)

    }

}