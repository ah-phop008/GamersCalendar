package com.example.mochi.gamerscalendar;

import java.util.Calendar;

public class CalendarEvent {

    private String eventName;
    private Calendar startDate;
    private Calendar endDate;
    private boolean isImportantEvent = false;
    private String eventPlace;
    private String eventDetail;


    public CalendarEvent (String name, Calendar startDate) {
        this.eventName = name;
        this.startDate = startDate;
        this.startDate.set(Calendar.SECOND, 0);
        this.endDate = Calendar.getInstance();
        this.endDate.set(this.startDate.get(Calendar.YEAR), this.startDate.get(Calendar.MONTH), this.startDate.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
    }



    //setter
    public void setEventName (String eventName) {
        this.eventName = eventName;
    }
    public void setStartDate (Calendar startDate) {
        this.startDate = startDate;
    }
    public void setEndDate (Calendar endDate) {
        this.endDate = endDate;
    }
    public void setImportantEventFlg (boolean flg) {
        this.isImportantEvent = flg;
    }
    public void setEventPlace (String eventPlace) {
        this.eventPlace = eventPlace;
    }
    public void setEventDetail (String eventDetail) {
        this.eventDetail = eventDetail;
    }

    //getter
    public String getEventName () {return this.eventName;}
    public Calendar getStartDate () {return this.startDate;}
    public Calendar getEndDate () {return this.endDate;}
    public boolean getImportantEventFlg () {return this.isImportantEvent;}
    public String getEventPlace () {return this.eventPlace;}
    public String getEventDetail () {return this.eventDetail;}
}
