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
    Fragment mFragment = null;

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                return new TimeIndigoFragment();
            case 1:
                return new ListIndigoFragment();
            case 2:
                return new ScheduleIndigoFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
