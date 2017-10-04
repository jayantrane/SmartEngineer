package com.vjti.dj.smartengineer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jayant on 02-10-2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "smartdb";
    private static final String TABLE_NAME = "reminder";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_DATE = "date";
    private static final String KEY_TIME = "time";

    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_NAME + " TEXT," + KEY_DATE + " TEXT,"
                + KEY_TIME + " TEXT"+ ")";
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void save(Reminder reminder){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(KEY_NAME, reminder.getName());
        values.put(KEY_DATE, reminder.getDate());
        values.put(KEY_TIME, reminder.getTime());



        db.insert(TABLE_NAME, null, values);
        Log.e("this","inserted success");
        db.close();
    }


    public List<Reminder> findAll(){
        List<Reminder> listReminder=new ArrayList<Reminder>();
        String query="SELECT * FROM "+TABLE_NAME;

        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Reminder Reminder=new Reminder();
                Reminder.setId(Integer.valueOf(cursor.getString(0)));
                Reminder.setName(cursor.getString(1));
                Reminder.setDate(cursor.getString(2));
                Reminder.setTime(cursor.getString(3));

                listReminder.add(Reminder);
            }while(cursor.moveToNext());
        }

        return listReminder;
    }


    public void delete(Reminder Reminder){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(TABLE_NAME, KEY_ID+"=?", new String[]{String.valueOf(Reminder.getId())});
        db.close();
    }



}

