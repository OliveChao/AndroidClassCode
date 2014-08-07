package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	Button btnRegister;
	Button btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_screen);
		
		//Initialization of variables
		btnRegister = (Button)findViewById(R.id.btnWelcomeRegister);
		btnLogin = (Button)findViewById(R.id.btnWelcomeLogin);
		
		//set on click listener
		btnRegister.setOnClickListener(this);
		btnLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		//switch case
		switch (v.getId()) {
		case R.id.btnWelcomeRegister:
			startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
			Toast.makeText(getApplicationContext(), "Welcome to the Register Page",Toast.LENGTH_LONG).show();
			break;
			
		case R.id.btnWelcomeLogin:
			startActivity(new Intent(getApplicationContext(),LoginScreen.class));
			Toast.makeText(getApplicationContext(), "Welcome to the Login Page",Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
		
	}

	
}
