package com.jacobhegna.chemistryhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
		
	public void searchElements(View v) {
		Intent intent = new Intent(this, ElementSearchActivity.class);
		startActivity(intent);
		intent = null;
	}
	
	public void polyTable(View v) {
		Intent intent = new Intent(this, PolyTableActivity.class);
		startActivity(intent);
		intent = null;
	}
	
	public void solubilityTable(View v) {
		Intent intent = new Intent(this, SolubilityTableActivity.class);
		startActivity(intent);
		intent = null;
	}
	
	//Default android methods
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
