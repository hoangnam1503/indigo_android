package com.indigo.indigo_android.activity;

import com.indigo.indigo_android.R;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by hoang_nam on 2014/05/07.
 */
public class HomeActivity extends ActionBarActivity {

	protected ActionBar actionBar = null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		actionBar = getSupportActionBar();
	}
}
