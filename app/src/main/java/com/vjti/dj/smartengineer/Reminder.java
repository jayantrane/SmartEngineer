package com.vjti.dj.smartengineer;

/**
 * Created by Jayant on 02-10-2017.
 */

public class Reminder {

    private String name;
    private String date;

    public Reminder(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}