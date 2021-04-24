package com.example.bookmovie;

import android.app.Activity;
import android.app.TabActivity;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class IndexActivity extends TabActivity {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_index);
			TabHost tabhost = (TabHost)findViewById(android.R.id.tabhost);
			
			TabSpec tab1 = tabhost.newTabSpec("HOME");
			tab1.setIndicator("HOME");
			tab1.setContent(new Intent(this,AboutUsActivity.class));
			tabhost.addTab(tab1);
			TabSpec tab2 = tabhost.newTabSpec("movies");
			tab2.setIndicator("Now Showing");
			tab2.setContent(new Intent(this,MoviesActivity.class));
			tabhost.addTab(tab2);
			TabSpec tab3 = tabhost.newTabSpec("contact");
			tab3.setIndicator("Contact Us");
			tab3.setContent(new Intent(this,ContactActivity.class));
			tabhost.addTab(tab3);
		}
}
