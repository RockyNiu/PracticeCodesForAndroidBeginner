package com.rockyniu.s01_e09_checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {
	private CheckBox eatBox;
	private CheckBox sleepBox;
	private CheckBox dotaBox;
	private CheckBox allCheckBox;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		eatBox = (CheckBox)findViewById(R.id.eatId);
		sleepBox = (CheckBox)findViewById(R.id.sleepId);
		dotaBox = (CheckBox)findViewById(R.id.dotaId);
		allCheckBox = (CheckBox)findViewById(R.id.allCheckId);
		
		OnBoxClickListener listener = new OnBoxClickListener();
		eatBox.setOnClickListener(listener);
		sleepBox.setOnClickListener(listener);
		dotaBox.setOnClickListener(listener);
		allCheckBox.setOnClickListener(listener);
		
		CheckBoxListener clickListener = new CheckBoxListener();
		eatBox.setOnCheckedChangeListener(clickListener);
		sleepBox.setOnCheckedChangeListener(clickListener);
		dotaBox.setOnCheckedChangeListener(clickListener);
		allCheckBox.setOnCheckedChangeListener(clickListener);
	}
	
	class CheckBoxListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			if (buttonView.getId() == R.id.eatId){
				System.out.println("eatBox");
			}
			else if (buttonView.getId() == R.id.sleepId){
				System.out.println("sleepBox");
			}
			else if (buttonView.getId() == R.id.dotaId){
				System.out.println("dotaBox");
			}			
			
			if(isChecked){
				System.out.println("Checked");
			}
			else {
				System.out.println("Unchecked");
			}
		}
		
	}
	class OnBoxClickListener implements OnClickListener{

		@Override
		public void onClick(View view) {
			CheckBox box = (CheckBox) view;
			if (box.getId() == R.id.allCheckId) {
				System.out.println("allCheckBox is clicked");
				boolean isChecked = box.isChecked();
				eatBox.setChecked(isChecked);
				sleepBox.setChecked(isChecked);
				dotaBox.setChecked(isChecked);
			}
			else if (eatBox.isChecked() && sleepBox.isChecked() && dotaBox.isChecked()){
				allCheckBox.setChecked(true);
			}
			if (!box.isChecked()){
				allCheckBox.setChecked(false);
			}
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
