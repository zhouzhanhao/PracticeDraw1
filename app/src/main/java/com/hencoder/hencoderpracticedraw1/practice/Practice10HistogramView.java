package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(100,50,100,600,paint);
        canvas.drawLine(100,600,1000,600,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(125,598,225,600,paint);
        canvas.drawRect(250,580,350,600,paint);
        canvas.drawRect(375,580,475,600,paint);
        canvas.drawRect(500,400,600,600,paint);
        canvas.drawRect(625,200,725,600,paint);
        canvas.drawRect(750,120,850,600,paint);
        canvas.drawRect(875,430,975,600,paint);
    }
}
