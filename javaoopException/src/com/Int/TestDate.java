package com.Int;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        method6();
    }

    private static void method6() {
        //标准格式化 String——时间类型  转换
        /*
        静态变量
        选择一个格式化属性
        * */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate localDate = LocalDate.now();
        String strDate = dateTimeFormatter.format(localDate);//时间——字符串
       /* System.out.println(strDate);
        System.out.println(localDate);*/
       String str = "2024-10-01";
       TemporalAccessor temporalAccessor = dateTimeFormatter.parse(str);
        //System.out.println(temporalAccessor);

        //本地格式化
        //创建转换器
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String str01 = dateTimeFormatter1.format(LocalDateTime.now());//时间——字符串
        /*System.out.println(str01);
        System.out.println(dateTimeFormatter1.parse("2024年10月1日 下午03时31分16秒"));*///字符串---时间

        //自定义格式化
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM~dd HH:mm@ss");
        System.out.println(dateTimeFormatter2.format(LocalDateTime.now()));
        System.out.println(dateTimeFormatter2.parse("2024/10~01 15:31@23"));
    }

    //第三阶段日期
    private static void method5() {
        //创建日期时间对象 通过now方法创建当前日期对象
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        //of()设置日期时间对象
        LocalDate localDate1 = LocalDate.of(2023,9,10);
        LocalTime localTime1 = LocalTime.of(15,23,45);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,10,1,8,9,10);
        /*System.out.println(localDate1);
        System.out.println(localTime1);
        System.out.println(localDateTime1);*/

        /*//get.XX()获得属性方法
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());*/

        /*//对某一时间部分进行操作：设置、添加、减少
        LocalDate localDate2 = localDate.withMonth(12);
        LocalDate localDate3 = localDate.plusMonths(1);
        LocalDate localDate4 = localDate.minusMonths(2);
        System.out.println("localDate4:"+localDate4);
        System.out.println("localDate3:"+localDate3);
        System.out.println("localDate2:"+localDate2);*/

    }

    private static void method4() {
        Calendar calendar = new GregorianCalendar();//声明父类new子类
        Calendar calendar1 = Calendar.getInstance();//通过方法获得对象
        /**
         * 以上两个代码获得的是当前系统的时间
         * 常用方法
         * */
        System.out.println(calendar);
        System.out.println(calendar1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println(calendar.getActualMaximum(Calendar.DATE));//获得当前月份的最大值

        calendar.set(2023,7,1);//表示八月一号，实际月份=输入月份+1
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
    private static void method3() throws ParseException {
        /**
         * 先将字符串类型时间转换成SQL类型时间
         * 将SQL类型时间转换成util类型时间
         * SimpleDateFormat可以直接将字符串类型的时间转换成util.Date类型
         * */
        DateFormat df = new SimpleDateFormat("yy-MM-dd");//yy-MM-dd 无参构造默认格式
        System.out.println(df.format(new Date()));//util.date   String
        //df.format();//java.util.Date--->String
        System.out.println(df.parse("2023-03-08"));//string --util.date


        SimpleDateFormat sdf = new SimpleDateFormat("");//有参构造
    }
    public static void method2(){
        /**
         * java.util.Date和java.sql.Date的区别：
         *
         * java.util.Date是java.sql.Date的父类
         * java.util.Date代表年月日时分秒，但java.sql.Date只能代表年月日
         * java.util.Date有有参构造和无参构造，但java.sql.Date只有有参构造器(放毫秒System.currentTimeMillis())
         *
         * */
        java.sql.Date dt = new java.sql.Date(System.currentTimeMillis());
        System.out.println(dt);
        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());//实际月份-1
        System.out.println(dt.getDate());
        /**
         * 两个类之间的转换 util.Date-->sql.Date
         * 父类转子类向下类型转换
         * */
        java.util.Date date = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date date1 = (java.sql.Date)date;

        java.sql.Date date2 = new java.sql.Date(date.getTime());
        java.util.Date date3 = date2;//自动类型转换
        /**
         * 字符串转换成sql.Date
         * */
        java.sql.Date date4 = java.sql.Date.valueOf("2013-08-08");

    }
    public static void method1(){
        //Date date1 = new Date();//无参构造，表示创建当前系统时间对象
        Date date = new Date(123,9,1);//2023年10月1号的时间对象
        System.out.println(date);
        System.out.println(date.toString());//默认时间格式：Tue Aug 08 14:58:33 GMT+08:00 2023
        System.out.println(date.toLocaleString());//获得本地时间格式
        System.out.println("_____________________________________________");
        System.out.println(date.getYear());//1900年到现在
        System.out.println(date.getMonth());//实际月份-1
        System.out.println(date.getDay());//获得星期   星期天==0
        System.out.println(date.getDate());//获得日期
        System.out.println(date.getTime());//获得毫秒
        System.out.println(System.currentTimeMillis());//获得毫秒————推荐使用
        System.out.println(date.getHours());//获得小时
        System.out.println(date.getMinutes());//获得分钟
        System.out.println(date.getSeconds());//获得秒
    }
}
