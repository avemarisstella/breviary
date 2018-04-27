package com.theironyard.entities;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Periodicaltexts {

    @Id
    @GeneratedValue
    int id;

    int page_number;
    String prayer_type;
    String prayer;
    String period;
    String week_day;
    int prayer_version;
    String prayer_desc;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    public String prayer_text;


    public Periodicaltexts() {}

    public Periodicaltexts(int page_number, String prayer_type, String prayer, String period, String week_day,
                           int prayer_version, String prayer_desc,
                           String prayer_text)
    {
        this.page_number = page_number;
        this.prayer_type = prayer_type;
        this.prayer = prayer;
        this.period = period;
        this.week_day = week_day;
        this.prayer_version = prayer_version;
        this.prayer_desc = prayer_desc;
        this.prayer_text = prayer_text;


    }

    public int getPage_number(){
        return page_number;
    }

    public void setPage_number(int page_number){
        this.page_number = page_number;
    }


    public String getPrayer_type(){
        return prayer_type;
    }

    public String getPrayer(){
        return prayer;
    }

    public String getPeriod(){
        return period;
    }

    public String getWeek_day(){
        return week_day;
    }

    public int getPrayer_version(){
        return prayer_version;
    }

    public String getPrayer_desc(){
        return prayer_desc;
    }

    public String getPrayer_text() {
        return prayer_text;
    }


}
