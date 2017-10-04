package com.vjti.dj.smartengineer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jayant on 02-10-2017.
 */

public class ReminderAdapter  extends ArrayAdapter<Reminder> implements View.OnClickListener{

    private List<Reminder> dataSet;
    Context mContext;

    private static class ViewHolder {
        TextView txtName;
        TextView txtDate;
        ImageView info;
    }

    public ReminderAdapter(List<Reminder> data, Context context) {
        super(context, R.layout.list_reminder, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Reminder reminder = (Reminder)object;

        Toast.makeText(getContext(),"List item "+reminder.getName(),Toast.LENGTH_SHORT).show();
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Reminder reminder = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_reminder, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.name1);
            viewHolder.txtDate = (TextView) convertView.findViewById(R.id.date1);
            viewHolder.info = (ImageView) convertView.findViewById(R.id.item_info);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.txtName.setText( reminder.getName());
        viewHolder.txtDate.setText( reminder.getDate());
        viewHolder.info.setOnClickListener(this);
        viewHolder.info.setTag(position);
        return convertView;
    }
}