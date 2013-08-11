package com.rockyniu.s01_e18_seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	private SeekBar seekBar;
	private RatingBar ratingBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		seekBar = (SeekBar)findViewById(R.id.firstSeekBar);
		ratingBar = (RatingBar)findViewById(R.id.fristRatingBar);
		
		seekBar.setMax(100);
		seekBar.setProgress(20);
		seekBar.setSecondaryProgress(50);
		
		seekBar.setOnSeekBarChangeListener(new SeekBarListener());
		ratingBar.setOnRatingBarChangeListener(new RatingBarListener());
	}
	class RatingBarListener implements OnRatingBarChangeListener{

		@Override
		public void onRatingChanged(RatingBar ratingBar, float rating,
				boolean fromUser) {
			System.out.println("progress" + rating + ";fromUser" + fromUser);
		}
		
	}
	
	class SeekBarListener implements OnSeekBarChangeListener{

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			System.out.println("progress" + progress + ";fromUser" + fromUser);
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			System.out.println("onStart");
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			System.out.println("onStop");
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
