package com.wanbang.life;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;

public class Container extends FragmentActivity{

	private Button btn_main;
	private Button btn_indi;
	private Button btn_more;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.container);
		btn_main = (Button)findViewById(R.id.btn_main);
		btn_indi = (Button)findViewById(R.id.btn_indi);
		btn_more = (Button)findViewById(R.id.btn_more);
		
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	
	
}
