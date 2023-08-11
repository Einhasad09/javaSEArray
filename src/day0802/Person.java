package day0802;

import java.util.Date;

public class Person {
    String name;
    private int age;
    public void putAge(int age){
        if(age>10 && age<=60){
            this.age=age;
        }else{
            this.age=20;
        }
    }

    public void show(){
        System.out.println("姓名是："+name+";年龄是："+age);
    }

    public Person(String name, int age) {
        this.name = name;
        putAge(age);
    }
}
