package com.example.bookmovie;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class MoviesActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_movie);
		//Button btn = (Button)findViewById(R.id.button);
		final WebView view = (WebView) findViewById(R.id.WebView);
		view.loadUrl("https://in.bookmyshow.com/explore/movies-indore");
		/*btn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				
				view.loadUrl("https://in.bookmyshow.com/explore/movies-indore");
			}
		});*/
	}
}
