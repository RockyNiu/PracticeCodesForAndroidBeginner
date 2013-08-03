package com.rockyniu.s01_e02_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button button;
	
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("MainActivity:onDestroy");
	}

	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("MainActivity:onPause");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("MainActivity:onRestart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("MainActivity:onResume");
	}

	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("MainActivity:onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("MainActivity:onStop");
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button)findViewById(R.id.button);
		button.setOnClickListener(new ButtonListener());
		System.out.println("MainActivity:onCreate");
		
	}

	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass (MainActivity.this, OtherActivity.class);
			startActivity (intent);
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
