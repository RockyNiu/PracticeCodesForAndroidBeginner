/**
* Rocky, Paper, Scissors / 猜拳小游戏
* @version 0.1, 2013-08-10
* @author RockyNiu
* @since JDK2.2
*/
package com.rockyniu.s01_e15_relativelayout;

import java.util.Random;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Random random;
	private String[] choice;
	private RadioGroup aRadioGroup, bRadioGroup;
	private RadioButton a1Button, a2Button, a3Button;
	private RadioButton b1Button, b2Button, b3Button;
	private Button okButton;
	private TextView choiceATextView, choiceBTextView, resultTextView;
	
/*	Resources res = getResources();
	String[] choice = res.getStringArray(R.array.choice);*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		choice = this.getResources().getStringArray(R.array.choice);
		
		aRadioGroup = (RadioGroup)findViewById(R.id.aRadioGroupId);
		a1Button = (RadioButton)findViewById(R.id.a1RadioButtonId);
		a2Button = (RadioButton)findViewById(R.id.a2RadioButtonId);
		a3Button = (RadioButton)findViewById(R.id.a3RadioButtonId);

		bRadioGroup = (RadioGroup)findViewById(R.id.bRadioGroupId);
		b1Button = (RadioButton)findViewById(R.id.b1RadioButtonId);
		b2Button = (RadioButton)findViewById(R.id.b2RadioButtonId);
		b3Button = (RadioButton)findViewById(R.id.b3RadioButtonId);
		
		okButton =(Button)findViewById(R.id.okButtonId);
		choiceATextView = (TextView)findViewById(R.id.choiceATextViewId);
		choiceBTextView = (TextView)findViewById(R.id.choiceBTextViewId);
		resultTextView = (TextView)findViewById(R.id.resultTextViewId);
		
		ButtonListener buttonListener = new ButtonListener();
		okButton.setOnClickListener(buttonListener);
		
		RadioGroupListener radioGroupListener = new RadioGroupListener();
		aRadioGroup.setOnCheckedChangeListener(radioGroupListener);
		bRadioGroup.setOnCheckedChangeListener(radioGroupListener);
	}

	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			if (v.getId() == R.id.okButtonId){
				int win = Win (aRadioGroup, bRadioGroup);
				if (win == 1){
					resultTextView.setText("A");
				}
				else if (win == 0){
					resultTextView.setText("Win-Win");
				}
				else if (win == -1){
					resultTextView.setText("B");
				}
			}
		}
		
	}
	
	class RadioGroupListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			int idx = Id2Index (group);						
			if (group.getId() == R.id.aRadioGroupId){
				choiceATextView.setText(choice[idx]);
			}
			else if (group.getId() == R.id.bRadioGroupId){
				choiceBTextView.setText(choice[idx]);
			}
		}
		
	}
	
	int Win (RadioGroup groupA, RadioGroup groupB) {
		int win = 0;
		int aIndex = Id2Index(groupA);
		int bIndex = Id2Index(groupB);
		int dif = aIndex - bIndex;
		if (dif == 0){
			win = 0;
		}
		else if ((dif == -1)||(dif == 2)){
			win = -1;
		}
		else if ((dif == -2)||(dif == 1)){
			win = 1;
		}
		System.out.println("win:" + win);
		return win;
	}
	
	int Id2Index (RadioGroup group){
		int radioButtonID = group.getCheckedRadioButtonId();
		View radioButton = group.findViewById(radioButtonID);
		int idx = group.indexOfChild(radioButton);
		System.out.println("radioButtonID("+radioButtonID+"):"+idx);
		return idx;
	}
	
/*	class RadioGroupClickistener implements OnClickListener{

		@Override
		public void onClick(View v) {
			RadioGroup group = (RadioGroup) v;
			if (group.getId() == R.id.aRadioGroupId){
				choiceATextView.setText("A:"+group.getCheckedRadioButtonId());
			}
			else if (group.getId() == R.id.bRadioGroupId){
				choiceBTextView.setText("B:"+group.getCheckedRadioButtonId());
			}
		}
		
	}*/
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
