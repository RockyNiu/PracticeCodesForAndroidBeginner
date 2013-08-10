package com.rockyniu.s01_e11_imageview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class MainActivity extends Activity {
	private ImageView imageView1, imageView2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imageView1 = (ImageView)findViewById(R.id.imageView1Id);
		imageView2 = (ImageView)findViewById(R.id.imageView2Id);
		
		imageView1.setScaleType(ScaleType.FIT_XY);
		
//		imageView1.setImageResource(R.drawable.point);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
