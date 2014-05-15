package com.indigo.indigo_android.fragment;

import com.indigo.indigo_android.R;
import com.indigo.indigo_android.base.ListFragmentBase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hoang_nam on 2014/05/14.
 */
public class TimeIndigoFragment extends ListFragmentBase {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		mContext = getActivity();
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_list, container, false);
		
		return rootView;
	}
}
