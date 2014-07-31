package com.example.helloworld;// the package we are working in

//some android packages we need to import
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

//our activity class (extends the default activity class)
public class MainActivity extends ActionBarActivity {
	
	//called when the class is first called
	@Override 
	
	//the function called when activity is created
	protected void onCreate(Bundle savedInstanceState) {
		 //call the create function Of the base class
		super.onCreate(savedInstanceState);
		//load the layout specified in the layout.xml
		setContentView(R.layout.main_page);

		
	}

}
