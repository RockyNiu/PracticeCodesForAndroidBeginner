package com.rockyniu.s02_e03_lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("create");
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	protected void onDestroy() {
		System.out.println("destroy");
		super.onDestroy();
	}


	@Override
	protected void onPause() {
		System.out.println("pause");
		super.onPause();
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}


	@Override
	protected void onResume() {
		System.out.println("resume");
		super.onResume();
	}


	@Override
	protected void onStart() {
		System.out.println("start");
		super.onStart();
	}


	@Override
	protected void onStop() {
		System.out.println("stop");
		super.onStop();
	}
    
}
