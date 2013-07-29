package com.rockyniu.s01_e06_view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView textView;
	private Button button;
	int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView = (TextView) findViewById(R.id.textView);
/*        textView.setText("Hello Rocky");
        textView.setBackgroundColor(Color.BLUE);*/
        
        button = (Button) findViewById(R.id.buton);

        ButtonListener buttonListener = new ButtonListener();
        button.setOnClickListener(buttonListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			count ++;
			textView.setText(count + "");
			
		}
    	
    }
    
}
