package com.vjti.dj.smartengineer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class page extends AppCompatActivity {

    String s;
    ListView listview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        listview = (ListView) findViewById(R.id.listview);

    final ArrayList<String> list = new ArrayList<String>();
    for (int i = 1; i < 6; ++i) {
        list.add(getIntent().getExtras().getString("lect-"+i));
    }
    final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
    listview.setAdapter(adapter);

}
}
