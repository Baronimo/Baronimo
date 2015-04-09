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
*/

package com.example.baronimo;

import Tabs.SlidingTabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

public class PlanCrawl extends ActionBarActivity {
	
private ViewPager mPager;
private SlidingTabLayout mTabs;;

Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

}

