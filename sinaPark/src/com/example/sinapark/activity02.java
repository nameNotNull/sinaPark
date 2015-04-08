package com.example.sinapark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity02 extends Activity {
	public TextView myTextView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity02);
		Intent intent = getIntent();
		String string = intent.getStringExtra("testIntent");
		myTextView = (TextView)findViewById(R.id.myTextViewNewActivity);
		myTextView.setText(string);
		
	}
	

}
