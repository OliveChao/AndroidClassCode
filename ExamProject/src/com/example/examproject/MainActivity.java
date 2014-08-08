package com.example.examproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	//Declaration of variables
			Button btnRegister;
			Button btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		//Initialization of variables
		btnRegister = (Button)findViewById(R.id.btnWelcomeRegister);
		btnLogin = (Button)findViewById(R.id.btnWelcomeLogin);
		
		//set an On click listener
		btnRegister.setOnClickListener(this);
		btnLogin.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()){
		case R.id.btnWelcomeRegister:
			startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
			break;
			
		case R.id.btnWelcomeLogin:
			startActivity(new Intent(getApplicationContext(),LoginActivity.class));

		default:
			break;
		}
		
	}
	
}