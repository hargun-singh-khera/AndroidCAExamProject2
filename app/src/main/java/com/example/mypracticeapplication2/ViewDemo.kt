package com.example.mypracticeapplication2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class ViewDemo(context: Context): View(context){
    val paint = Paint()
    var x = 30
    var y = 30
    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.YELLOW)
        paint.color = Color.GREEN
        canvas.drawRect(0f+x, 1800f-y, 400f+x, 2100f-y, paint)
        paint.color = Color.RED
        canvas.drawRect(650f-x, 1800f-y, 1050f-x, 2100f-y, paint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> moveRect()
            MotionEvent.ACTION_UP -> stopRect()
        }
        return true
    }
    fun moveRect() {
        x = x + 20
        y = y + 20
        invalidate()
    }
    fun stopRect() {}
}