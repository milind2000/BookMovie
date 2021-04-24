package com.example.bookmovie;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class AboutUsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		ImageButton inox = (ImageButton)findViewById(R.id.inox);
		inox.setOnClickListener(new OnClickListener() {				
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://in.bookmyshow.com/buytickets/inox-sapna-sangeeta-mall-sneha-nagar/cinema-ind-ININ-MT/20210312"));
				startActivity(intent);
			}
		});
		
		ImageButton pvr = (ImageButton)findViewById(R.id.pvr);
		pvr.setOnClickListener(new OnClickListener() {				
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://in.bookmyshow.com/buytickets/pvr-treasure-island-mall-indore/cinema-ind-PVIN-MT/20210312"));
				startActivity(intent);
			}
		});
	}
}
