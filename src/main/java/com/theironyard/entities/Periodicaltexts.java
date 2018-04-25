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
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    public String prayer_text;


    public Periodicaltexts() {}

    public Periodicaltexts(int page_number, String prayer_type, String prayer, String period, String week_day,
                           int prayer_version,
                           String prayer_text)
    {
        this.page_number = page_number;
        this.prayer_type = prayer_type;
        this.prayer = prayer;
        this.period = period;
        this.week_day = week_day;
        this.prayer_version = prayer_version;
        this.prayer_text = prayer_text.replaceAll("S","N");;


    }

    public int getPage_number(){
        return page_number;
    }

    public void setPage_number(int page_number){
        this.page_number = page_number;
    }

    public String convertPrayerText() {
        String a;
        a = this.prayer_text;
        a.replaceAll("\n","<br />");
        return a;
    }


}
