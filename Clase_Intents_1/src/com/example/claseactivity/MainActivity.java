package com.example.claseactivity;

import com.example.claseactivity.R;

import android.net.Uri;
import android.os.Bundle;

import android.provider.ContactsContract;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		Button btn2 = (Button) findViewById(R.id.button2);
		Button btn3 = (Button) findViewById(R.id.button3);
		Button btn4 = (Button) findViewById(R.id.button4);
		Button btn5 = (Button) findViewById(R.id.button5);
		Button btn6 = (Button) findViewById(R.id.button6);
		
        btn1.setOnClickListener(new OnClickListener() {
        
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub							
			Intent intent = new Intent(Intent.ACTION_VIEW,ContactsContract.Contacts.CONTENT_URI);
			startActivity(intent);
					        
			}
		});
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.android.com"));
				startActivity(intent);
				
			}
		});
        btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:978875389"));
				startActivity(intent);
			}
		});
        

        btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(MainActivity.this,ActivityC.class);
				startActivity(intent);
			}
		});
        
        
        btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(MainActivity.this,ActivityA.class);
				intent.putExtra("valor1", "cadena de texto para el valor1");				
				startActivity(intent);
			}
		});
        
        
        btn6.setOnClickListener(new OnClickListener() {
			
     			@Override
     			public void onClick(View v) {
     				// TODO Auto-generated method stub
     				
     				Intent intent = new Intent(MainActivity.this,ActivityB.class);				
     				startActivity(intent);
     			}
     		});
        
        
        Log.i("CREATE ACTIVITY", "CREATE");
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("START ACTIVITY", "START");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("RESUME ACTIVITY", "RESUME");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("PAUSE ACTIVITY", "PAUSE");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("STOP ACTIVITY", "STOP");
	}
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("DESTROY ACTIVITY", "DESTROY");		
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		
		
	}

}
