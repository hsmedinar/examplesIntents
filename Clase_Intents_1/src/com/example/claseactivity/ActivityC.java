package com.example.claseactivity;

import com.example.claseactivity.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityC extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activityc);
		
		WebView web = (WebView) findViewById(R.id.webView1);		
		web.loadUrl("http://android.cix.pe");
	}
}
