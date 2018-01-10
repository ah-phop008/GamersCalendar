package com.example.mochi.gamerscalendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;


public class MyCalendar extends LinearLayout {

    public MyCalendar(Context context, AttributeSet attr) {
        super(context, attr);

        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(context).inflate(R.layout.my_calendar_layout, this, true);
    }

}