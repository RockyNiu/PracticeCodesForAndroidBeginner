package com.rockyniu.s02_e04_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity{

	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		
		Intent intent = getIntent();
		int age = intent.getIntExtra("com.rockyniu.s02_e04_intent.Age", 10);
		String name = intent.getStringExtra("com.rockyniu.s02_e04_intent.Name");
		
		textView = (TextView) findViewById(R.id.textView);
		textView.setText(name + ":" + age);
		textView.setText(name);
	}

}
