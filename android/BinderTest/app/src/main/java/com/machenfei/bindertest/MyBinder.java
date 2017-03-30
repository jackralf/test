package com.machenfei.bindertest;

import android.os.Binder;
import android.util.Log;

/**
 * Created by machenfei on 2017/3/27.
 */

public class MyBinder extends Binder {
    public static final String TAG = MyBinder.class.getSimpleName();
    public void echo() {
        Log.d(TAG, "echo: hello world" );
    }
}
