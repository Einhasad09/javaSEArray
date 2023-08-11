import com.age11.AgeException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {
        String s = "abc";
        String ss = "abc";
        String s3 = "abc" + "def"; // 此处编译器做了优化!
        String s4 = "abcdef";
        String s5 = ss + "def";
        String s2 = new String("abc");
        System.out.println(s == ss);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
    }
        /*Student student = new Student();
        try {
            student.setAge(15);
        } catch (ArithmeticException | AgeException e) {
            e.printStackTrace();
        }

        try {
            student.setAge(23);
        } catch (ArithmeticException | AgeException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }*/
        //System.out.println((int)((Math.random() * 30) + 30));
        /*String a = "123";
        int num = Integer.parseInt(a);
        System.out.println(num);*/
        /*DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        *//*System.out.println(calendar.get(Calendar.DATE));*//*
        java.util.Date date1 = new java.sql.Date(System.currentTimeMillis());
        System.out.println(df.format(date1));
        //System.out.println(date1.getTime());
       *//* String dTime = "2022-02-02";
        System.out.println("date:"+date);
        System.out.println(df.format(new Date()));
        System.out.println("dTime:"+df.parse("2022-02-02"));*/



}
