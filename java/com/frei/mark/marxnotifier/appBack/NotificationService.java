package com.frei.mark.marxnotifier.appBack;

import android.content.Context;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
//import android.content.Intent;
//import android.content.IntentFilter;
//import android.content.BroadcastReceiver;
//import android.support.v4.content.LocalBroadcastManager;


public class NotificationService extends NotificationListenerService {

    private String TAG = this.getClass().getSimpleName();
    //private NLServiceReceiver nlsservicereceiver;
    Context context;

    @Override
    public void onCreate() {
        Log.i(TAG,"SERVICE CREATED");
        super.onCreate();
        context = getApplicationContext();
    }
/*
    @Override
    public void onListenerConnected() {
        nlsservicereceiver = new NLServiceReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.frei.mark.marxnotifier.LISTENER");
        registerReceiver(nlsservicereceiver,filter);
        Log.d(TAG,"onConnected");
    }

    @Override
    public void onListenerDisconnected() {
        unregisterReceiver(nlsservicereceiver);
        Log.d(TAG,"onDisconnected");
    }
*/
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        Log.i(TAG,"NOTIFICATION POSTED");
        // Intent i = new  Intent("com.frei.mark.marxnotifier.LISTENER");
        //i.putExtra("notification_event","onNotificationPosted :" + sbn.getPackageName() + "\n");
        //sendBroadcast(i);
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        Log.i(TAG,"NOTIFICATION REMOVED");
        //Intent i = new  Intent("com.frei.mark.marxnotifier.LISTENER");
        //i.putExtra("notification_event","onNotificationRemoved :" + sbn.getPackageName() + "\n");
        //sendBroadcast(i);
    }

    @Override
    public void onDestroy(){
        Log.i(TAG,"SERVICE DESTROYED");
        super.onDestroy();
    }

/*
    class NLServiceReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getStringExtra("command").equals("clearall")){
                NFService.this.cancelAllNotifications();
            }
            else if(intent.getStringExtra("command").equals("list")){
                Intent i1 = new  Intent("com.frei.mark.marxnotifier.LISTENER");
                i1.putExtra("notification_event","=====================");
                sendBroadcast(i1);
                int i=1;
                for (StatusBarNotification sbn : NFService.this.getActiveNotifications()) {
                    Intent i2 = new  Intent("com.frei.mark.marxnotifier.LISTENER");
                    i2.putExtra("notification_event",i +" " + sbn.getPackageName() + "\n");
                    sendBroadcast(i2);
                    i++;
                }
                Intent i3 = new  Intent("com.frei.mark.marxnotifier.LISTENER");
                i3.putExtra("notification_event","===== Notification List ====");
                sendBroadcast(i3);

            }

        }
    }*/
}
