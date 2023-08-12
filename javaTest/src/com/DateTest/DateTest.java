package com.DateTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) throws ParseException {

        //Calender();
        //Data01();
        //WanNianLi();
        Date03();
    }
    public static void Data01() throws ParseException {
        Date date = new Date();
        Date date1 = new Date(123,9,1);
        java.util.Date date2 = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date date3 = (java.sql.Date)date2;
        System.out.println("date3:"+date3);
        java.sql.Date date4 = new java.sql.Date(date2.getTime());
        System.out.println("date4:"+date4);
        java.util.Date date5 = date3;
        java.sql.Date date6=java.sql.Date.valueOf("2022-02-02");

        System.out.println(date1.toString());
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(new Date()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse("2023 -02 - 03"));

    }

    public static void Calender(){
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar:"+calendar);
        calendar.getActualMaximum(Calendar.DATE);


    }

    public static void WanNianLi() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查看的日期：");
        System.out.println("按yyyy-MM-dd的格式书写");
        String strDate = input.next();
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        date = df.parse(strDate);
        //System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        int maxDay = calendar.getActualMaximum(Calendar.DATE);
        int nowDay = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE,1);
        //System.out.println("calendar:"+calendar);
        int num = calendar.get(Calendar.DAY_OF_WEEK);
        int day =num-1;
        int count=0;
        for (int i = 1; i <=day ; i++) {
            System.out.print("\t");
        }
        count +=day;


        for(int i = 1;i<=maxDay;i++){
            if(i==nowDay){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if(count%7==0){
                System.out.println();
            }
        }
    }

    public static void Date03(){
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate:"+localDate);
        LocalDate localDate1 = LocalDate.of(2023,9,10);

        LocalDate localDate2 = localDate.withMonth(10);
        System.out.println("localDate2:"+localDate2);
        LocalDate localDate3 = localDate.plusMonths(1);
        LocalDate localDate4 = localDate.minusMonths(1);
        System.out.println("localDate3:"+localDate3+"\n"+"localDate4:"+localDate4);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        String strDate = dtf.format(localDate);
        System.out.println("strDate:"+strDate);

        String str = "2023-02-02";
        TemporalAccessor temporalAccessor = dtf.parse(str);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String str1 = dtf1.format(LocalDate.now());

    }
}

