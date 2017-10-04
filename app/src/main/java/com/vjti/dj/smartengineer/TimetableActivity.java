package com.vjti.dj.smartengineer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
    }
    public void monday(View view)
    {
        Intent intent = new Intent(this, page.class);
        intent.putExtra("lect-1","Economics" );
        intent.putExtra("lect-2","Programming developemnt" );
        intent.putExtra("lect-3","Digital logic design" );
        intent.putExtra("lect-4","Discreate Mathematics" );
        intent.putExtra("lect-5","Applied Mathematics" );
        startActivity(intent);
    }
    public void tuesday(View view) {
        Intent intent = new Intent(this, page.class);
        intent.putExtra("lect-1", "Economics");
        intent.putExtra("lect-2", "Programming developemnt");
        intent.putExtra("lect-3", "Digital logic design");
        intent.putExtra("lect-4", "Discreate Mathematics");
        intent.putExtra("lect-5", "Applied Mathematics");
        startActivity(intent);
    }
    public void wednesday(View view) {
        Intent intent = new Intent(this, page.class);
        intent.putExtra("lect-1", "Economics");
        intent.putExtra("lect-2", "Programming developemnt");
        intent.putExtra("lect-3", "Digital logic design");
        intent.putExtra("lect-4", "Discreate Mathematics");
        intent.putExtra("lect-5", "Applied Mathematics");
        startActivity(intent);
    }
    public void thursday(View view) {
        Intent intent = new Intent(this, page.class);
        intent.putExtra("lect-1", "Economics");
        intent.putExtra("lect-2", "Programming developemnt");
        intent.putExtra("lect-3", "Digital logic design");
        intent.putExtra("lect-4", "Discreate Mathematics");
        intent.putExtra("lect-5", "Applied Mathematics");
        startActivity(intent);
    }
    public void friday(View view) {
        Intent intent = new Intent(this, page.class);
        intent.putExtra("lect-1", "Economics");
        intent.putExtra("lect-2", "Programming developemnt");
        intent.putExtra("lect-3", "Digital logic design");
        intent.putExtra("lect-4", "Discreate Mathematics");
        intent.putExtra("lect-5", "Applied Mathematics");
        startActivity(intent);
    }
    public void saturday(View view) {
        Intent intent = new Intent(this, page.class);
        intent.putExtra("lect-1", "Economics");
        intent.putExtra("lect-2", "Programming developemnt");
        intent.putExtra("lect-3", "Digital logic design");
        intent.putExtra("lect-4", "Discreate Mathematics");
        intent.putExtra("lect-5", "Applied Mathematics");
        startActivity(intent);
    }
}
