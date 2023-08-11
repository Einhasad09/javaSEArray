package com.DateTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) throws ParseException {

        //Data01();
    }
    public static void Data01() throws ParseException {
        Date date = new Date();
        Date date1 = new Date(123,9,1);

        System.out.println(date1.toString());
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(new Date()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse("2023 -02 - 03"));
    }

    public static void Calender(){
        Calendar calendar = new GregorianCalendar();
        Calendar calendar1 = Calendar.getInstance();

        System.out.println(calendar);
        calendar1.getActualMaximum(Calendar.DATE);

    }
}
