package com.example.sinapark;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class activity03 extends Activity{

	private static final String[] autoComp = new String[]{
		"abcc","abcdefg","ababc"
			};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity03);
		AutoCompleteTextView textView = (AutoCompleteTextView) 		findViewById(R.id.myAutoComTextViewNewActivity);
		ArrayAdapter<String> adapter = new 		ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,autoComp);
		textView.setAdapter(adapter);
	}
	

}
