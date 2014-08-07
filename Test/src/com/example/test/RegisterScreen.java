package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	Button btnDisplay;
	Button btnBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_screen);
		
		//Initialization of variables
		btnDisplay = (Button)findViewById(R.id.btnRegisterDisplay);
		btnBack = (Button)findViewById(R.id.btnRegisterBack);
		
		//set on click listener
		btnDisplay.setOnClickListener(this);
		btnBack.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnRegisterDisplay:
			Toast.makeText(getApplicationContext(), "Welcome back to Welcome Screen:-)", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.btnRegisterBack:
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			Toast.makeText(getApplicationContext(), "Welcome back to Welcome Screen:-)", Toast.LENGTH_SHORT).show();

		default:
			break;
		}
		
	}

}
