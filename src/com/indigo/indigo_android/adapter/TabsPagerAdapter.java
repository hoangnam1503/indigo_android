package com.indigo.indigo_android.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.indigo.indigo_android.fragment.ListIndigoFragment;
import com.indigo.indigo_android.fragment.ScheduleIndigoFragment;
import com.indigo.indigo_android.fragment.TimeIndigoFragment;

/**
 * Created by hoang_nam on 2014/05/14.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    protected Fragment mFragment = null;
    protected TimeIndigoFragment timeIndigoFragment;
    protected ListIndigoFragment listIndigoFragment;
    protected ScheduleIndigoFragment scheduleIndigoFragment;
    protected final String[] titles = { "To do", "Schedule", "Calendar" };

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

	@Override
	public CharSequence getPageTitle(int position) {
		return titles[position];
	}

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
            	if (timeIndigoFragment == null)
            		timeIndigoFragment = new TimeIndigoFragment();
                return timeIndigoFragment;
            case 1:
            	if (listIndigoFragment == null)
            		listIndigoFragment = new ListIndigoFragment();
                return listIndigoFragment;
            case 2:
            	if (scheduleIndigoFragment == null)
            		scheduleIndigoFragment = new ScheduleIndigoFragment();
                return scheduleIndigoFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
