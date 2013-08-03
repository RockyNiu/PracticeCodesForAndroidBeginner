package com.rockyniu.s01_e02_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class OtherActivity extends Activity{
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("OtherActivity:onDestroy");
	}

	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("OtherActivity:onPause");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("OtherActivity:onRestart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("OtherActivity:onResume");
	}

	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("OtherActivity:onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("OtherActivity:onStop");
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		System.out.println("OtherActivity:onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
