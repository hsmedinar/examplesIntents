package com.example.clase3;

import com.example.clase3.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn= (Button) findViewById(R.id.btnEnviar);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ActivityProcesa.class);
				
				intent.putExtra("valor1", 2);
				intent.putExtra("valor2", 4);
				
				startActivityForResult(intent, 40);		
			}
		});
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		Toast.makeText(this, String.valueOf(requestCode) + " " + String.valueOf(resultCode)
				+ " " + String.valueOf(data.getExtras().getInt("result")), Toast.LENGTH_LONG).show();
				
	}

	

}
