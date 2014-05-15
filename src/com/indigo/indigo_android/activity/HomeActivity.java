package com.indigo.indigo_android.activity;

import com.indigo.indigo_android.R;
import com.indigo.indigo_android.adapter.TabsPagerAdapter;
import com.indigo.indigo_android.base.FragmentActivityBase;
import com.indigo.indigo_android.utility.PagerSlidingTabStrip;

import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.os.Bundle;

/**
 * Created by hoang_nam on 2014/05/07.
 */
public class HomeActivity extends FragmentActivityBase {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		pagerTabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
		viewPager = (ViewPager) findViewById(R.id.pager_home);
		
		actionBar = getSupportActionBar();
		
		pagerTabStrip.setShouldExpand(true);
		pagerTabStrip.setIndicatorColorResource(R.color.indicator_tab);
		
		tabsPagerAdapter = new TabsPagerAdapter(getSupportFragmentManager());		
		viewPager.setAdapter(tabsPagerAdapter);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);

		pagerTabStrip.setViewPager(viewPager);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_top, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		
		if (item.getItemId() == android.R.id.home) {
			Toast.makeText(this, "You are home now!", Toast.LENGTH_SHORT).show();
			return true;
		} else if (item.getItemId() == R.id.action_search) {
			Toast.makeText(this, "Please try google.com!", Toast.LENGTH_SHORT).show();
			return true;
		} else if (item.getItemId() == R.id.action_info) {
			Toast.makeText(this, "No information available!", Toast.LENGTH_SHORT).show();
			return true;
		}
		return true;
	}

	@Override
	public void onTabChanged(String arg0) {
	}
}
