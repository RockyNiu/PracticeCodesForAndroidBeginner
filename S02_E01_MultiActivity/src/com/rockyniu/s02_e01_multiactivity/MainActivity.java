package com.rockyniu.s02_e01_multiactivity;

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
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new ButtonListener());
	}
	
	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			// setClass函数的地一个参数是Context对象
			// Context是一个类，Activity是Context的子类，也就是说所有的Activity对象都可以向上转型为Context的对象
			// setClass函数的第二个参数是一个Class对象，在当前场景下，应当传入需要启动的Activity类的class对象
			intent.setClass (MainActivity.this, SecondActivity.class);
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
