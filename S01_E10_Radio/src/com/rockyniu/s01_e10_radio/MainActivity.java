package com.rockyniu.s01_e10_radio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {
	
	private RadioGroup radioGroup01, radioGroup02;
	private RadioButton femaleButton, maleButton;
	private RadioButton shoppingButton, gameButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		radioGroup01 = (RadioGroup)findViewById(R.id.radioGroup01);
		femaleButton = (RadioButton)findViewById(R.id.femaleId);
		maleButton = (RadioButton)findViewById(R.id.maleId);
		
		radioGroup02 = (RadioGroup)findViewById(R.id.radioGroup02);
		shoppingButton = (RadioButton)findViewById(R.id.shoppingId);
		gameButton = (RadioButton)findViewById(R.id.gameId);
		
		RadioGroupListener radioGroupListener = new RadioGroupListener();
		radioGroup01.setOnCheckedChangeListener(radioGroupListener);
		radioGroup02.setOnCheckedChangeListener(radioGroupListener);
		
//		RadioButtonListener radioButtonListener = new RadioButtonListener();
//		femaleButton.setOnCheckedChangeListener(radioButtonListener);
	}

	class RadioButtonListener implements android.widget.CompoundButton.OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
			System.out.println("isChecked --->" + isChecked);
		}
		
	}
	class RadioGroupListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			if (checkedId == femaleButton.getId()){
				shoppingButton.setChecked(true);
			}
			else if (checkedId == maleButton.getId()){
				gameButton.setChecked(true);
			}
			else if (checkedId == shoppingButton.getId()){
				femaleButton.setChecked(true);
			}
			else if (checkedId == gameButton.getId()){
				maleButton.setChecked(true);
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
