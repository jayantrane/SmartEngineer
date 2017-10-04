package com.vjti.dj.smartengineer.old;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Jayant on 02-10-2017.
 */

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        Intent intent1 = new Intent(context, MyNewIntentService.class);
        context.startService(intent1);
    }
}