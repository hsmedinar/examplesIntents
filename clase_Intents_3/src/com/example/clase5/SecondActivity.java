package com.example.clase5;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		
		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI);
				startActivityForResult(intent, 1);
				
			}
		});
		
   }
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode==1){
            if(data!=null){
            	Uri selectimg = data.getData();
            	String[] pathimgs = {MediaStore.Images.Media.DATA};
            	
            	Cursor cursor = getContentResolver().query(selectimg, pathimgs, null, null, null);
            	cursor.moveToFirst();
            	            	
                int indexcursor = cursor.getColumnIndex(pathimgs[0]);
                String imgpath = cursor.getString(indexcursor);
                
                ImageView imgv = (ImageView) findViewById(R.id.imageView1);
                imgv.setImageBitmap(BitmapFactory.decodeFile(imgpath));
            }						
		}
	}
		
}

/*
Button btn = (Button) findViewById(R.id.button1);
btn.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
		startActivityForResult(intent, 1);
		
	}
});

}

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
// TODO Auto-generated method stub
super.onActivityResult(requestCode, resultCode, data);

if(requestCode==1){
	if(data!=null){
		
		Uri selectimages = data.getData();
		String[] dataimages ={MediaStore.Images.Media.DATA};
		
		Cursor cursor = getContentResolver().query(selectimages, dataimages, null, null, null);
		cursor.moveToFirst();
		
		int cursorindex = cursor.getColumnIndex(dataimages[0]);
		String pathimg = cursor.getString(cursorindex);
		
		ImageView img = (ImageView) findViewById(R.id.imageView1);
		img.setImageBitmap(BitmapFactory.decodeFile(pathimg));
						
	}
}


}

*/
