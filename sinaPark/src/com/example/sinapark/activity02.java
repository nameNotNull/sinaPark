package com.example.sinapark;

import com.example.sinapark.MainActivity.MyButtonListener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class activity02 extends Activity {
	public TextView myTextView = null;
	private Button myButton = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity02);
		Intent intent = getIntent();
		String string = intent.getStringExtra("testIntent");
		myTextView = (TextView)findViewById(R.id.myTextViewNewActivity);
		myTextView.setText(string);
		myButton = (Button)findViewById(R.id.newActivityButton);
	    myButton.setOnClickListener( (android.view.View.OnClickListener) new MyButtonListener());
	       
		
	}
	 
  
   class MyButtonListener implements OnClickListener{
  		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.putExtra("testIntent", "成功启动第3个activity");
			intent.setClass(activity02.this, activity03.class);
			activity02.this.startActivity(intent);
		}
   }
}
