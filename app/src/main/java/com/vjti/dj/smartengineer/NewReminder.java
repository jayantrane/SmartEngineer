package com.vjti.dj.smartengineer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewReminder extends AppCompatActivity {

    DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_reminder);

        databaseHandler = new DatabaseHandler(this);





    }
    public void getData(View view)
    {
        Reminder reminder =new Reminder();
        EditText ed1 = (EditText)findViewById(R.id.editText);
        reminder.setName(ed1.getText().toString());
        EditText ed2 = (EditText)findViewById(R.id.editText2);
        reminder.setDate(ed2.getText().toString());
        EditText ed3 = (EditText)findViewById(R.id.editText3);
        reminder.setTime(ed3.getText().toString());

        databaseHandler.save(reminder);

        finish();


    }
}
