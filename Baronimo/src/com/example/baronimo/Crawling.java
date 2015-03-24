package com.example.baronimo;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

/**
 * This page will show all information of the first bar on the page
 * It will include a googlemap showing the route from the current location to the bar, the map can be dismissed with an 'I'm here' button
 * There will be an option to start the clock/alarm timer
 * Under the map there will be images and information about the bar
 * At the bottom of the page is a next button which reloads the page but with the details of the next bar in the list, if the bar is not the first in the list there is also a previous button
 * Abandon crawl option with a confirmation pop up. There will also be a 'help me get home' check box, if clicked this brings up a map with nearby taxi depos and telephone numbers for local firms
 * 
 * @author 40033364
 *
 */


public class Crawling extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crawling);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.crawling, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_crawling,
					container, false);
			return rootView;
		}
	}
}
