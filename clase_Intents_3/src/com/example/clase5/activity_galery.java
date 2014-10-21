package com.example.clase5;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

public class activity_galery extends Activity implements OnItemSelectedListener {
	
	Integer[] images= {R.drawable.img1_s,R.drawable.img2_s,R.drawable.img3_s,R.drawable.img4_s
			,R.drawable.img5_s,R.drawable.img6_s,R.drawable.img7_s};
	
	Integer[] images_g= {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4
			,R.drawable.img5,R.drawable.img6,R.drawable.img7};
	ImageSwitcher imgs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_gallery);
		
		Gallery gallery = (Gallery) findViewById(R.id.gallery1);
		imgs = (ImageSwitcher) findViewById(R.id.imageSwitcher1);		
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemSelectedListener(this);
								
	}
	
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		imgs.setBackgroundResource(images_g[arg2]);
		
	}



	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	class ImageAdapter extends BaseAdapter{
		
		Context mContext;
		
		ImageAdapter(Context context){
			mContext = context;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return images.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stuber
			ImageView i = new ImageView(mContext);
			i.setBackgroundResource(images[arg0]);			
			return i;
		}
		
		
	}
	
	
}
