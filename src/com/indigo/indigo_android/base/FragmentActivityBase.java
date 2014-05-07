package com.indigo.indigo_android.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by hoang_nam on 2014/05/07.
 */
public class FragmentActivityBase extends FragmentActivity {
    public static final int REQUEST_CODE_BASIC = 1;

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
}
