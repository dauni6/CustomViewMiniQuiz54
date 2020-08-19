package com.dontsu.customviewminiquiz5_4

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customView = CustomView(this@MainActivity)
        val customView2 = CustomView2(this)
        frameLayout.addView(customView)
        frameLayout.addView(customView2)


    }
}

class CustomView(context: Context) : View(context) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //1번 그리기 배경 파란색
        val rectf = RectF(200f, 450f, 600f, 650f)
        val rectPaint = Paint()
        rectPaint.color = Color.BLUE
        rectPaint.style = Paint.Style.FILL
        canvas?.drawRoundRect(rectf, 50f, 50f, rectPaint)

        //2번 그리기 테두리 빨간색
        rectPaint.color = Color.RED
        rectPaint.style = Paint.Style.STROKE
        rectPaint.strokeWidth = 10f
        canvas?.drawRoundRect(rectf, 50f, 50f, rectPaint)
    }
}

class CustomView2(context: Context) : View(context) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        // 빨간원 그리기
        val red = Paint()
        red.style = Paint.Style.FILL
        red.color = Color.RED
        canvas?.drawCircle(300f,300f, 200f, red)

        // 가운데 작은원 그리기
        val white = Paint()
        white.style = Paint.Style.FILL
        white.color = Color.WHITE
        canvas?.drawCircle(300f,300f, 150f, white)

    }
}