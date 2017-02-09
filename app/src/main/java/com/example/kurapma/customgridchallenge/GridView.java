package com.example.kurapma.customgridchallenge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kurapma on 2/9/17.
 */

public class GridView extends View implements View.OnClickListener{
    private int cellHeight;
    private int cellWidth;
    private int cellRows = 2;
    private int cellColumns = 2;
    private Paint lines = new Paint();

    public GridView(Context context) {
        super(context);
        init();
    }

    public GridView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public GridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        lines.setStyle(Paint.Style.FILL_AND_STROKE);
        lines.setColor(Color.BLACK);
        cellWidth = getWidth() / cellColumns;
        cellHeight = getHeight() / cellRows;

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh)
    {
        super.onSizeChanged(w, h, oldw, oldh);

        cellWidth = getWidth() / cellColumns;
        cellHeight = getHeight() / cellRows;

        invalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        for (int i = 0; i < cellRows; i++)
        {
            canvas.drawLine(0, i * cellHeight, getWidth(), i * cellHeight,
                    lines);
        }

        for (int i = 0; i < cellColumns; i++)
        {
            canvas.drawLine(i * cellWidth, 0, i * cellWidth, getHeight(),
                    lines);
        }
    }


    @Override
    public void onClick(View view) {

    }
}