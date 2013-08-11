package com.rockyniu.s01_e16_timepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class MainActivity extends Activity {
	
	private TimePicker firstTimePicker;
	private Button button;
	private DatePicker firstDatePicker;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		firstTimePicker = (TimePicker)findViewById(R.id.firsttimePicker);
		button = (Button)findViewById(R.id.button);
		firstDatePicker = (DatePicker)findViewById(R.id.firstDatePicker);
		
		firstDatePicker.updateDate(2013, 12, 11);
		
		firstTimePicker.setIs24HourView(true);
		TimeListener timeListenter = new TimeListener();
		firstTimePicker.setOnTimeChangedListener(timeListenter);
		
		ButtonListener buttonListener = new ButtonListener();
		button.setOnClickListener(buttonListener);
		
	}
	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			int hour = firstTimePicker.getCurrentHour();
			int minute =  firstTimePicker.getCurrentMinute();
			int year = firstDatePicker.getYear();
			int month = firstDatePicker.getMonth();
			int day = firstDatePicker.getDayOfMonth();
			System.out.println("hour:" + hour);
			System.out.println("minute:" + minute);		
			System.out.println("Day:" + day);
			System.out.println("Month:" + month);
			System.out.println("Year:" + year);
		}
		
	}
	
	class TimeListener implements OnTimeChangedListener{

		@Override
		public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
			System.out.println("hour:" + hourOfDay);
			System.out.println("minute:" + minute);
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
