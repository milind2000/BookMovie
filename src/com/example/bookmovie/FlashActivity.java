package com.example.bookmovie;

import android.os.Bundle;
import android.content.Intent;
import java.util.TimerTask;
import java.util.Timer;
import android.app.Activity;
import android.view.Menu;

public class FlashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        TimerTask tt = new TimerTask(){
        	@Override
        	public void run() {
        		// TODO Auto-generated method stub
        		startActivity(new Intent(FlashActivity.this,IndexActivity.class));
        	}
        };
        
        Timer timer = new Timer();
        timer.schedule(tt,2000);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.flash, menu);
        return true;
    }
    
}
