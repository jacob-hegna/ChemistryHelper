package com.jacobhegna.chemistryhelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class ElementSearchActivity extends Activity {

	public void initSearch() {
    	EditText searchBox = (EditText) findViewById(R.id.enterElementBox);
    	searchBox.addTextChangedListener(new TextWatcher() {
    		@Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
    			ElementData elements = new ElementData();
    			elements.init();
    			
    			int resultNum = 0;
    			
    			TextView resultsOne = (TextView) findViewById(R.id.viewResultsOne);
    			resultsOne.setTextSize(35.f);
    			resultsOne.setText("");
    			
    			TextView resultsTwo = (TextView) findViewById(R.id.viewResultsTwo);
    			resultsTwo.setTextSize(35.f);
    			resultsTwo.setText("");
    			
    			TextView resultsThree = (TextView) findViewById(R.id.viewResultsThree);
    			resultsThree.setTextSize(35.f);
    			resultsThree.setText("");
    			
    			TextView resultsFour = (TextView) findViewById(R.id.viewResultsFour);
    			resultsFour.setTextSize(35.f);
    			resultsFour.setText("");
    			
    			TextView resultsFive = (TextView) findViewById(R.id.viewResultsFive);
    			resultsFive.setTextSize(35.f);
    			resultsFive.setText("");
    			
    	    	for(int i = 0; i < 118; i++) {
    	    		if(s.toString().length() <= elements.elements[i].name.length()) {
    	    			if((s.toString().toLowerCase().equals(elements.elements[i].name.substring(0, s.toString().length()).toLowerCase())) && s.toString().equals("") != true ){
            				resultNum++;
        	    			switch(resultNum) {
        	    			case 1:
        	    				resultsOne.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
        	    				break;
        	    			case 2:
        	    				resultsTwo.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
        	    				break;
        	    			case 3:
        	    				resultsThree.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
        	    				break;
        	    			case 4:
        	    				resultsFour.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
        	    				break;
        	    			case 5:
        	    				resultsFive.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
        	    				break;
        	    			}
            			}  else {
            				if((s.toString().toLowerCase().equals(elements.elements[i].name.toLowerCase())) && s.toString().equals("") != true ){
                				resultNum++;
            	    			switch(resultNum) {
            	    			case 1:
            	    				resultsOne.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
            	    				break;
            	    			case 2:
            	    				resultsTwo.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
            	    				break;
            	    			case 3:
            	    				resultsThree.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
            	    				break;
            	    			case 4:
            	    				resultsFour.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
            	    				break;
            	    			case 5:
            	    				resultsFive.setText(elements.elements[i].name.concat(" (").concat(elements.elements[i].symbol).concat(")"));
            	    				break;
            	    			}
            				}
            			}

    	    		}
    	    	}
    	    	
    	    	elements = null;
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            	
            }

            @Override
            public void afterTextChanged(Editable s)
            {
    			
            }
    	});
    }
	
	public void onClick(View v) {
    	TextView text = (TextView) findViewById(v.getId());
    	
    	ElementData elements = new ElementData();
    	elements.init();
    	int elementNumber = -1;
    	
    	for(int i = 0; i < 118; i++) {
    		if(elements.elements[i].name.length() <= text.getText().length()) {
    			if(elements.elements[i].name.equals(text.getText().toString().substring(0, elements.elements[i].name.length()))) {
        			elementNumber = i;
        		}	
    		}
    	}
    	
    	if(elementNumber != -1) {
    		Intent intent = new Intent(this, ElementDisplayActivity.class);
        	intent.putExtra("com.example.chemistryhelper.elementName", elements.elements[elementNumber].name);
        	intent.putExtra("com.example.chemistryhelper.elementSymbol", elements.elements[elementNumber].symbol);
    		intent.putExtra("com.example.chemistryhelper.elementNumber", elements.elements[elementNumber].number);
    		intent.putExtra("com.example.chemistryhelper.elementMass", elements.elements[elementNumber].mass);
    		intent.putExtra("com.example.chemistryhelper.elementGroup", elements.elements[elementNumber].group);
    		intent.putExtra("com.example.chemistryhelper.elementPeriod", elements.elements[elementNumber].period);
    		
        	startActivity(intent);	
        	intent = null;
    	}
    	
    	elements = null;
    }

	
	// Default Android methods
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_element_search);
		// Show the Up button in the action bar.
		setupActionBar();
		
		initSearch();
	}
/*
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
		getMenuInflater().inflate(R.menu.element_search, menu);
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
