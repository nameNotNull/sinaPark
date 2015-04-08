package com.example.sinapark;
import java.text.AttributedCharacterIterator.Attribute;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View
{
	public float currentX = 40;
	public float currentY = 50;
	
	Paint pa = new Paint();
	public DrawView(Context context , AttributeSet set)
	{
		super(context,set);
	}
	public void onDraw(Canvas canvas) 
	{
		super.onDraw(canvas);
		pa.setColor(Color.RED);
		canvas.drawCircle(currentX, currentY, 15, pa);
		
		
	}
	public boolean onTouchEvent(MotionEvent event)
	{
		currentX = event.getX();
		currentY = event.getY();
		invalidate();
		return true;
		
	}
}