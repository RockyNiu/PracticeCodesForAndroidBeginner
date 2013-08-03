package com.rockyniu.s02_e03_lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("买车");
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	protected void onDestroy() {
		System.out.println("车辆报废");
		super.onDestroy();
	}


	@Override
	protected void onPause() {
		System.out.println("松开油门");
		super.onPause();
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}


	@Override
	protected void onResume() {
		System.out.println("踩油门，驱动汽车前进");
		super.onResume();
	}


	@Override
	protected void onStart() {
		System.out.println("打火，启动");
		super.onStart();
	}


	@Override
	protected void onStop() {
		System.out.println("熄火");
		super.onStop();
	}
    
}
