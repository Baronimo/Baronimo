package com.example.baronimo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import com.example.baronimo.R;

public class MainActivity extends Activity implements OnClickListener {

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

	// setting buttons for MainActivity Screen
	Button btnQuick = (Button) findViewById(R.id.btnQuick);
	Button btnPlan = (Button) findViewById(R.id.btnPlan);

	// Method for btnQuick layout change
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnQuick:
			setContentView(R.layout.activity_quick_drink);
			break;
		case R.id.btnPlan:
			setContentView(R.id.activity_plan_crawl);
		}

	}
}
