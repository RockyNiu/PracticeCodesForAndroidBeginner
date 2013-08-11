package com.rockyniu.s01_e17_progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

	private ProgressBar progressBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		progressBar = (ProgressBar)findViewById(R.id.firstProgressBar);
		progressBar.setMax(100);
		progressBar.setProgress(20);
		progressBar.setSecondaryProgress(30);
		
		boolean flag = progressBar.isIndeterminate();
		System.out.println(flag + "");
		
		progressBar.incrementProgressBy(20);
		progressBar.incrementSecondaryProgressBy(50);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
