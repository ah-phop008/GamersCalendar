package com.example.mochi.gamerscalendar;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;


public class CalendarCell extends LinearLayout {

    private Context context;
    private ArrayList<CalendarEvent> eventList;
    private ArrayList<TextView> eventTextViewList;
    private View parent;


    //コンストラクタ

    public CalendarCell(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.calendar_cell, this);
        init(context);
    }

    private  void init (Context context) {
        this.context = context;
        eventList = new ArrayList<CalendarEvent>();
        eventTextViewList = new ArrayList<TextView>();
        //Realmで保存したEventをListに追加する
        addCalendarEventList(new CalendarEvent("テスト", Calendar.getInstance()));//テストイベント

        Log.d("CalendarCell", this.getChildAt(0).getId() + "ああああああああああああああああああああああ");
    }


    public void addCalendarEventList (CalendarEvent event) {
        eventList.add(event);

        TextView textView = new TextView(context);
        textView.setText(event.getEventName());
        if (event.getImportantEventFlg()) { textView.setBackgroundColor(Color.rgb(247, 83, 83));}



    }


}