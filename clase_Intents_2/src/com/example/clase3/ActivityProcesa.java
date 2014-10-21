package com.example.clase3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityProcesa extends Activity {
	
	int valor1;
	int valor2;
	int result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		    
		Bundle valores = getIntent().getExtras();
		
		if(valores!=null){
			valor1 = valores.getInt("valor1");
			valor2 = valores.getInt("valor2");			
		}
		
		LinearLayout ln = new LinearLayout(this);
		Button btn = new Button(this);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				result = valor1 * valor2; 
				intent.putExtra("result", result);
				setResult(RESULT_OK,intent);
				finish();
			}
		});
		
		ln.addView(btn);
		setContentView(ln);				     
	}
}
