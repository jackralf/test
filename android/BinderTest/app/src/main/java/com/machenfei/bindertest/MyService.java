package com.machenfei.bindertest;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    private static final String TAG = MyService.class.getSimpleName();

    private Handler handler = new Handler();
    private IBinder mBinder = new MyBinder();
    private Messenger mMessenger = new Messenger(new MessenagerHandler());
    private IMyAidlInterface.Stub mBinder2 = new IMyAidlInterface.Stub() {
        @Override
        public void echo() throws RemoteException {
            Log.d(TAG, "echo: ");
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(MyService.this, "hello", Toast.LENGTH_SHORT).show();
                }
            });

        }
    };

    private class MessenagerHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    Toast.makeText(MyService.this, "handleMessage:" + msg.what, Toast.LENGTH_SHORT).show();
                    Log.d(TAG, "handleMessage: 1");
                    break;
                default:
                    break;
            }
        }
    }

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
//        return mMessenger.getBinder();
        return mBinder2;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    private void runOnUiThread(Runnable runnable) {
        handler.post(runnable);
    }
}
