package com.example.wanderingWeatherWheel

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class CustomDividerItemDecoration(): RecyclerView.ItemDecoration() {

    private val innerSpacing = R.dimen.item_decoration_spacing

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val itemPosition = parent.getChildAdapterPosition(view)

        outRect.left = if (itemPosition == 0) 0 else innerSpacing / 8
        outRect.right = if (itemPosition == state.itemCount - 1) 0 else innerSpacing / 8
    }
}