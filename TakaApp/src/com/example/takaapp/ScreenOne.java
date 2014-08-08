package com.example.takaapp;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class ScreenOne extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	Button btnSend;
	Button btnCancel;
	EditText etNo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen_one);

		//initialization of variables
		btnSend = (Button)findViewById(R.id.btnScreenOneSend);
		btnCancel = (Button)findViewById(R.id.btnScreenOneCancel);
		etNo = (EditText)findViewById(R.id.etScreenOneNo);
		
		//set an on click listener;
		btnSend.setOnClickListener(this);
		btnCancel.setOnClickListener(this);
		
		//convert edit text to integer
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnScreenOneSend:
			 startActivity(new Intent(getApplicationContext(),SplashScreen.class)); 
			
			break;

		default:
			break;
		}
		
	}

}
