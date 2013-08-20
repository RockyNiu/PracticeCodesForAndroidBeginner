package com.rockyniu.s02_e05_thread;

import com.rockyniu.s02_e05_thread.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textView;
	private Button button;
	private ProgressBar progressBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView)findViewById(R.id.textViewId);
		progressBar = (ProgressBar)findViewById(R.id.progressBarId);
		button = (Button)findViewById(R.id.buttonId);
		button.setOnClickListener(new ButtonListener());
	}

	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			try {
				Thread.sleep(10*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
/*			Thread t = new MyThread();
			t.start();*/
		}
		
	}
	
	class MyThread extends Thread{
		@Override
		public void run(){
			for (int i = 0; i <=100; i++){
				try{				
					Thread.sleep(100);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
				progressBar.setProgress(progressBar.getProgress() + 1);
			}
		}
	}
/*	class MyThread extends Thread{
		@Override
		public void run(){
			try{
				Thread.sleep(1*1000);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
			textView.setText("来自与线程的修改");
		}
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
