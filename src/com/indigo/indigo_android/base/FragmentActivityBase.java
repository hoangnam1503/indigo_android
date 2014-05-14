/*
package com.indigo.indigo_android.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import com.indigo.indigo_android.adapter.TabsPagerAdapter;

*/
/**
 * Created by hoang_nam on 2014/05/07.
 *//*

public abstract class FragmentActivityBase extends ActionBarActivity implements ActionBar.TabListener {
    public static final int REQUEST_CODE_BASIC = 1;
    protected ViewPager viewPager = null;
    protected ActionBar actionBar = null;
    protected TabsPagerAdapter tabsPagerAdapter = null;

    protected String[] tabs = {"Time", "List", "Schedule"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public Intent createIntent (Class nextActivity) {
        Intent tmp_intent = new Intent(getApplicationContext(), nextActivity);
        return tmp_intent;
    }

    public void goNextActivity(Intent intent) {
        startActivityForResult(intent, REQUEST_CODE_BASIC);
    }

    public void goNextActivity(Intent intent, int requestCode) {
        startActivityForResult(intent, requestCode);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {}

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {}
}
*/
