package com.vjti.dj.smartengineer;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReminderActivity extends AppCompatActivity {
    private ReminderAdapter adapter;
    private ArrayList<Reminder> myDataset;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_reminders);


        myDataset = new ArrayList<>();
        myDataset.add(new Reminder("Jayant" ,"26/9/2017"));
        myDataset.add(new Reminder("Devangi" ,"26/9/2017"));
        myDataset.add(new Reminder("Barak" ,"26/9/2017"));
        myDataset.add(new Reminder("Mark" ,"26/9/2017"));


        listView=(ListView)findViewById(R.id.list_item);

        adapter= new ReminderAdapter(myDataset,getApplicationContext());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Reminder reminder= myDataset.get(position);

                Toast.makeText(ReminderActivity.this,reminder.getName()+" item clicked",Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReminderActivity.this,NewReminder.class);
                startActivity(intent);
            }
        });
    }
}
