package com.example.mycollection;

import java.util.ArrayList;
import java.util.Arrays;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity implements OnItemClickListener {
	
	private ListView listView;
	private ArrayAdapter<String> stringArrayAdapter;
	String []planets = {"Mercury","Earth","Venus","Neptune","Mars","Pluto","Saturn"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Initialization
		listView = (ListView)findViewById(R.id.mainList);
		
		ArrayList<String> planetList = new ArrayList<String>();
		planetList.addAll(Arrays.asList(planets));
		
		//Design the ListView
		stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.simple_layout,planetList);
	    listView.setAdapter(stringArrayAdapter);
	    listView.setOnItemClickListener(this);
	}

	public void onItemClick(AdapterView<?> arg0,View view, int position, long arg3) {
		String listPosition = listView.getItemAtPosition(position).toString();
		
		Toast.makeText(getApplicationContext(), listPosition + ":" + position, Toast.LENGTH_LONG).show();
	}

	
	
}
