package com.jacobhegna.chemistryhelper;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ElementDisplayActivity extends Activity {

	public void showData(String elementName, 
			             String elementSymbol, 
			             int elementNumber, 
			             double elementMass, 
			             int elementGroup, 
			             int elementPeriod) {
		
		TextView viewName   = (TextView) findViewById(R.id.atomicName);
		viewName.setTextSize(30);
		viewName.setText("Name: ".concat(elementName));
		
		TextView viewSymbol = (TextView) findViewById(R.id.atomicSymbol);
		viewSymbol.setTextSize(30);
		viewSymbol.setText("Symbol: ".concat(elementSymbol));
		
		TextView viewNumber = (TextView) findViewById(R.id.atomicNumber);
		viewNumber.setTextSize(30);
		viewNumber.setText("Number: ".concat(Integer.toString(elementNumber)));
		
		TextView viewMass   = (TextView) findViewById(R.id.atomicMass);
		viewMass.setTextSize(30);
		viewMass.setText("Mass: ".concat(Double.toString(elementMass)));
		
		TextView viewGroup  = (TextView) findViewById(R.id.atomicGroup);
		viewGroup.setTextSize(30);
		if(elementGroup != -1)
			viewGroup.setText("Group: ".concat(Integer.toString(elementGroup)));
		else
			viewGroup.setText("Group: N/A");
		
		TextView viewPeriod = (TextView) findViewById(R.id.atomicPeriod);
		viewPeriod.setTextSize(30);
		viewPeriod.setText("Period: ".concat(Integer.toString(elementPeriod)));
		
	}
	
	// Android default methods, bleh
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_element_display);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Intent intent = getIntent();
		String elementName   = intent.getStringExtra("com.example.chemistryhelper.elementName");
		String elementSymbol = intent.getStringExtra("com.example.chemistryhelper.elementSymbol");
		int    elementNumber = intent.getIntExtra("com.example.chemistryhelper.elementNumber", 0);
		double elementMass   = intent.getDoubleExtra("com.example.chemistryhelper.elementMass", 0);
		int    elementGroup  = intent.getIntExtra("com.example.chemistryhelper.elementGroup", 0);
		int    elementPeriod = intent.getIntExtra("com.example.chemistryhelper.elementPeriod", 0);
				
		showData(elementName, 
				elementSymbol, 
				elementNumber, 
				elementMass, 
				elementGroup, 
				elementPeriod);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.element_display, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
