package com.vjti.dj.smartengineer;

import android.content.Intent;
import android.icu.util.GregorianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
  //  private ScheduleClient scheduleClient;
    int NOTIFICATION_REMINDER_NIGHT =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     scheduleClient = new ScheduleClient(this);
   //     scheduleClient.doBindService();

   //     if(scheduleClient==null)
   //         Log.d("Sc","NULL");

        /*Calendar c = Calendar.getInstance();
        Calendar calSet = (Calendar) c.clone();

        calSet.set(Calendar.HOUR_OF_DAY, 13);
        calSet.set(Calendar.MINUTE, 45);
        calSet.set(Calendar.SECOND, 0);
        calSet.set(Calendar.MILLISECOND, 0);

        *//*c.set(2017, 10, 02);
        c.set(Calendar.HOUR_OF_DAY, 16);
        c.set(Calendar.MINUTE, 15);
        c.set(Calendar.SECOND, 0);*//*
        //c.set(2017,10,2,16,21,0);
       // System.out.println(dateFormat.format(cal));
        // Ask our service to set an alarm for that date, this activity talks to the client that talks to the service
        if(calSet == null)
            Log.d("CALSET IS NULL","null");
        else
            Log.d("CALSET IS NOT NULL","NOt null");*/
        //android.icu.util.Calendar i = ;
  //      android.icu.util.Calendar i = new GregorianCalendar();
  //      i.set(2017,10,2,4,43);
//        scheduleClient.setAlarmForNotification(i);
        // Notify the user what they just did
        Toast.makeText(this, "Notification set for: ", Toast.LENGTH_SHORT).show();
    }

    public void initiateReminder(View view){
        Intent intent = new Intent(MainActivity.this,ReminderActivity.class);
        startActivity(intent);
    }

    public void timetable(View view){
        Intent intent = new Intent(MainActivity.this,TimetableActivity.class);
        startActivity(intent);
    }
}
