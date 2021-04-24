package com.example.bookmovie;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ContactActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);
		
		Button call = (Button)findViewById(R.id.call);
		Button mail  = (Button)findViewById(R.id.mail);
		Button msg = (Button)findViewById(R.id.msg);
		
		call.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:9630627881"));
				startActivity(intent);
			}
		});
		
		mail.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.putExtra(intent.EXTRA_EMAIL, new String[]{"milindphalke30@gmail.com"});
				intent.putExtra(intent.EXTRA_SUBJECT, new String[]{"First Mail"});
				intent.putExtra(intent.EXTRA_TEXT, "hey");
				intent.putExtra(intent.EXTRA_BCC, new String[]{"milindphalke30@gmial.com"});
				intent.putExtra(intent.EXTRA_CC, new String[]{"milindphalke30@gmial.com"});
				intent.setType("message/rfc822");
				startActivity(intent);
			}
		});
		
		msg.setOnClickListener(new OnClickListener() {			
			@Override
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=+918224901067 & text =GOODMORNING"));
				/*intent.putExtra("sms-body", "Type your SMS here");
				intent.setType("vnd.android-dir/mms-sms");*/
				startActivity(intent);
			}
		});
		
	}
}
