package com.example.claseactivity;

import com.example.claseactivity.R;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ActivityA extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitya);
		
		Log.i("CREATE ACTIVITY 2", "CREATE");
		
		Bundle datos = getIntent().getExtras();
		
		if(datos==null)
			return;
		
		String valor = datos.getString("valor1");
		Log.i("Valor1", valor);
		
		LinearLayout ln = (LinearLayout) findViewById(R.id.contenedor_text);		
		
		for(byte x=0;x<=25;x++){
		 TextView txt = new TextView(this);		
		 txt.setText(valor);		 		 
		 ln.addView(txt);
		}
		
					
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("START ACTIVITY 2", "START");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("RESUME ACTIVITY 2", "RESUME");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("PAUSE ACTIVITY 2", "PAUSE");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("STOP ACTIVITY 2", "STOP");
	}
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("DESTROY ACTIVITY 2", "DESTROY");		
	}
	

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		
		Log.i("SAVEINSTANCE ACTIVITY 2", "SAVEINSTANCE");
	}
	
}
