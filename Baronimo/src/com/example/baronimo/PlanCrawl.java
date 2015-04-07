package com.example.baronimo;

import com.example.baronimodatabase.DbManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
/**
 * This page requires a basic menu
 * Functionality should include
 * Load crawl button placed at the top right
 * Save and start Crawl button placed at top left (deactivated unless two or more bars are in the list)
 *  - Once clicked a message pops up to allow input of a name with save and cancel buttons, once submitted then the user is taken to the Crawl page
 * 
 * A list of current bars which can be reordered by drag and drop, removed by a double click
 *  
 * Swipe left to reveal all bars ordered by distance away from current location 
 *  - contains a filter at the top with categories - to be defined
 *  - from here they can be added to the crawl by double click
 *  - long press reveals additional information in a pop-up with a add to crawl button and back button
 *   - potential 'bar not here? Add it' option
 * 
 * Swipe right to see currently selected bars and route displayed on a map - numbered place holders?
 * 
 * @author Matt
 *
 */
public class PlanCrawl extends Activity {
	
	private DbManager mDbManager; 
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plan_crawl);
		
		mDbManager = new DbManager(this);
		mDbManager.open();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.plan_crawl, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
