package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        canvas.drawArc(150,50,550,450,-180,120,true,paint);

        paint.setColor(Color.WHITE);
        canvas.drawLine(100,50,250,50,paint);
        canvas.drawLine(250,50,265,65,paint);
        paint.setTextSize(25);
        canvas.drawText("Lollipop",5,50,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(170,70,570,470,-60,58,true,paint);

        paint.setColor(Color.WHITE);
        canvas.drawLine(570,180,670,180,paint);
        canvas.drawLine(570,180,555,195,paint);
        canvas.drawText("Marshmallow",680,180,paint);

        paint.setColor(Color.LTGRAY);
        canvas.drawArc(170,70,570,470,2,20,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(170,70,570,470,25,55,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(170,70,570,470,83,95,true,paint);
    }
}
