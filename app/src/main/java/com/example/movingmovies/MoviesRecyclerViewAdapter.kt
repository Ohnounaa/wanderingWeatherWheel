package com.example.movingmovies

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule


@GlideModule
class MoviesRecyclerViewAdapter(val arr: MutableList<String>) : RecyclerView.Adapter<MoviesRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ImageView(parent.context).apply{
            layoutParams = RecyclerView.LayoutParams(
                RecyclerView.LayoutParams.MATCH_PARENT,
                RecyclerView.LayoutParams.MATCH_PARENT
            )
        })
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       Glide.with(holder.iv).load(arr[position]).into(holder.iv)
    }

    override fun getItemCount(): Int {
        return arr.size;
    }

    class ViewHolder(val iv: ImageView): RecyclerView.ViewHolder(iv)

}