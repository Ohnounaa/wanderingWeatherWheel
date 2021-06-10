package com.example.movingmovies

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.Math.abs

class MagnifyingLayoutManager(context: Context) : LinearLayoutManager(context, HORIZONTAL, false) {

    override fun scrollHorizontallyBy(
        dx: Int,
        recycler: RecyclerView.Recycler?,
        state: RecyclerView.State?
    ): Int {

        val centerOfRecylcerView = width/2
        val distanceFactor: Float = 1.5f
        val scaleShrinkFactor: Float = 0.5f

        for(i in 0 until childCount) {
            val child: View? = getChildAt(i)

            val childPosition = (child?.left?.plus(child.right))?.div(2)
            val distanceToMiddle = kotlin.math.abs(childPosition?.minus(centerOfRecylcerView)!!)

            val scaleFactor = 1f.coerceAtMost(distanceToMiddle / distanceFactor)
            val scale = 1f - scaleFactor*scaleShrinkFactor
            child.scaleX=scale
            child.scaleY=scale
        }



        return super.scrollHorizontallyBy(dx, recycler, state)

    }
}