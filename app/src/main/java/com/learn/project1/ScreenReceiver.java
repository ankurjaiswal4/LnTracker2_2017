package com.learn.project1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.database.DatabaseReference;

/**
 * Created by livingroom on 23-11-2016.
 */
public class ScreenReceiver extends BroadcastReceiver {

   // public static boolean wasScreenOn = true;

    private DatabaseReference mDatabase;




    @Override
    public void onReceive(final Context context, final Intent intent) {
      //  Log.e("LOB","onReceive");

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            // do whatever you need to do here
        //    wasScreenOn = false;
          //  Log.e("LOB","wasScreenOn"+wa  sScreenOn);
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            // and do whatever you need to do here
           /// wasScreenOn = true;

        }else if(intent.getAction().equals(Intent.ACTION_USER_PRESENT)){
            //Log.e("LOB","userpresent");

           // Log.e("LOB","wasScreenOn"+wasScreenOn);
            String url = "http://www.ankurjaiswal.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
    }
}