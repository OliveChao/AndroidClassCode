package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	EditText etUserName , etEmail , etPassword;
	String strUserName , strEmail , strPassword;
	Button btnDisplay;
	Button btnBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_screen);
		
		//Initialization of variables
		etUserName = (EditText)findViewById(R.id.etRegisterUserName);
		etEmail = (EditText)findViewById(R.id.etRegisterEmail);
		etPassword = (EditText)findViewById(R.id.etRegisterPassword);
		btnDisplay = (Button)findViewById(R.id.btnRegisterDisplay);
		btnBack = (Button)findViewById(R.id.btnRegisterBack);
		
		//set on click listener
		btnDisplay.setOnClickListener(this);
		btnBack.setOnClickListener(this);
		
		//UserName,Email and Password to string
		strUserName = etUserName.getText().toString();
		strEmail = etEmail.getText().toString();
		strPassword = etPassword.getText().toString();
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnRegisterDisplay:
			 Toast.makeText(getApplicationContext(), strUserName , Toast.LENGTH_SHORT).show();
			 Toast.makeText(getApplicationContext(), strEmail , Toast.LENGTH_SHORT).show();
			 Toast.makeText(getApplicationContext(), strPassword , Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.btnRegisterBack:
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			Toast.makeText(getApplicationContext(), "Welcome back to Welcome Screen:-)", Toast.LENGTH_SHORT).show();

		default:
			break;
		}
		
	}

}
