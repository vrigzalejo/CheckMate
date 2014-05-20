package com.chess.checkmate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// Remove title bar:
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar:
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.splash);
		
		Thread splashThread = new Thread() {
			@Override
			public void run() {
				try {
					int waited = 0;
					// Set wait time
					while (waited < 4000) {
						sleep(100);
						waited += 1000;
					}
					
				} catch (InterruptedException e) {
					// nothing
				} finally {
					finish();
					Intent i = new Intent();
					i.setClassName("com.chess.checkmate", "com.chess.checkmate.CheckMate");
					startActivity(i);
				}
			}
		};
		splashThread.start();
	}

}
