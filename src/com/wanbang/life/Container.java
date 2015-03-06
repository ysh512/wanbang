package com.wanbang.life;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class Container extends FragmentActivity {

	private AccountFragment accountFragment;
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
		
		btn_main.setOnClickListener(fragmentClick);
		btn_indi.setOnClickListener(fragmentClick);
		btn_more.setOnClickListener(fragmentClick);
		
	}

	private View.OnClickListener fragmentClick = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			FragmentManager fm = Container.this.getSupportFragmentManager();
//			FragmentManager fm = getFragmentManager();
			// ¿ªÆôÊÂÎñ
			FragmentTransaction ft = fm.beginTransaction();
			
			switch(v.getId())
			{
			case R.id.btn_indi:
				if(accountFragment==null)
				{
					accountFragment = new AccountFragment();
				}
				ft.replace(R.id.fragment, accountFragment);
				ft.commit();
				break;
			}
		}
	};
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
