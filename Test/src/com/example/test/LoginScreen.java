package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class LoginScreen extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	Button btnVerify;
	Button btnBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);
		
		//initialization of variables
		btnVerify = (Button)findViewById(R.id.btnLoginVerify);
		btnBack = (Button)findViewById(R.id.btnLoginBack);
		
		//set on click listener
		btnVerify.setOnClickListener(this);
		btnBack.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnLoginVerify:
			
			break;
			
	    case R.id.btnRegisterBack:
	    	startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
	    	Toast.makeText(getApplicationContext(), "Welcome Back to the Welcome Screen:-)", Toast.LENGTH_LONG).show();

		default:
			break;
		}
		
	}
}
