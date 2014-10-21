package com.example.clase5;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class recibir_image extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		LinearLayout ln = new LinearLayout(this);
		
		Intent intent = getIntent();  
		
		String accion = intent.getAction();
		Bundle extras = intent.getExtras();
		
		if(accion.equals(Intent.ACTION_SEND)){
			if(extras!=null){
				Toast.makeText(this, "ingreso", Toast.LENGTH_LONG).show();
				
				Uri selectimg = (Uri) extras.getParcelable(Intent.EXTRA_STREAM);
				String[] columnas ={MediaStore.Images.Media.DATA};
				Cursor cursor = getContentResolver().query(selectimg, columnas, null, null, null);
				cursor.moveToFirst();
				
				
				int cursor_index = cursor.getColumnIndex(columnas[0]);
				String pathimg = cursor.getString(cursor_index);
				
				ImageView imgv = new ImageView(this);
				imgv.setImageBitmap(BitmapFactory.decodeFile(pathimg));
				ln.addView(imgv);
				
			}
					
		}
		setContentView(ln);
		
		
	}
}
