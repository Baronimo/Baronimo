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
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
 
 
public class PlanCrawl extends ActionBarActivity {
 
    // Declaring Your View and Variables
 
    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"Home","Events"};
    int Numboftabs =2;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
 
        // Creating The Toolbar and setting it as the Toolbar for the activity
 
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
 
 
        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);
 
        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
 
        // Assigning the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
 
        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });
 
        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
 
 
 
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
 
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
 
        return super.onOptionsItemSelected(item);
    }
}