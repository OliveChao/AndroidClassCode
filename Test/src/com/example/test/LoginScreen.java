package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	EditText etUserName , etPassword;
	String strUserName , strPassword;
	Button btnVerify;
	Button btnBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);
		
		//initialization of variables
		etUserName = (EditText)findViewById(R.id.etLoginUserName);
		etPassword = (EditText)findViewById(R.id.etLoginPassword);
		btnVerify = (Button)findViewById(R.id.btnLoginVerify);
		btnBack = (Button)findViewById(R.id.btnLoginBack);
		
		//set on click listener
		btnVerify.setOnClickListener(this);
		btnBack.setOnClickListener(this);
		
		//password to string and userName to string
		strUserName = etUserName.getText().toString();
		strPassword = etPassword.getText().toString();
				
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnLoginVerify:
			strUserName = "akirachix";
			strPassword = "girls@ict2013";
			
			if (etUserName.getText().toString().equals("")&& etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "input user name and password", Toast.LENGTH_LONG).show();	
			}
			else if (etUserName.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "input user name", Toast.LENGTH_LONG).show();	
			}
			else if (etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "input password", Toast.LENGTH_LONG).show();	
			}
			else if (!etUserName.getText().toString().equals("strUserName")) {
				Toast.makeText(getApplicationContext(), "Wrong User Name", Toast.LENGTH_LONG).show();	
			}
			else if (!etPassword.getText().toString().equals("strPassword")) {
				Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_LONG).show();	
			}
			else if (etUserName.getText().toString().equals("")&& etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "Step Into My World", Toast.LENGTH_LONG).show();	
			}
			
			break;
			
	    case R.id.btnRegisterBack:
	    	startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
	    	Toast.makeText(getApplicationContext(), "Welcome Back to the Welcome Screen:-)", Toast.LENGTH_LONG).show();
	    	break;

		default:
			break;
		}
		
	}
}
