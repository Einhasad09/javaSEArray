package homework0802;
import static java.lang.Math.*;
import info.Product;
import info.ProductCategory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*第一题*//*
        //IT
        IT it1 = new IT("马未龙",35,"数据库维护",10);
        IT it2 = new IT("张凯",15,"Java开发",1);
        it1.showInfo("腾讯实业","数据库维护工程师");
        it2.showInfo("鼎盛科技","Java开发工程师");*/
        /*第二题*//*
        //Meeting
        Meeting meeting = new Meeting("第二","会议室","空闲");
        Meeting meeting1 = new Meeting("第一","会议室","预定");
        meeting1.book("孙甜甜");
        meeting.book("孙甜甜");*/
        /*第三题*//*
        //Dog
        Dog dogTianXin = new Dog("贵宾犬",3,"心情好","甜心");
        Dog dogTaiZi = new Dog("德国牧羊犬",2,"心情不好","太子");
        dogTianXin.bark();
        dogTianXin.run();
        dogTaiZi.bark();
        dogTaiZi.run();*/
        /*第四题*//*
        //Car
        Car car = new Car("京A0000","东风","Blue",20.0,500.0);
        car.lease("武松",10);*/
        /*第五题*//*
        //Product ProductCategory
        ProductCategory productCategory = new ProductCategory("1","洗发水");
        Product product = new Product("1","飘柔洗发水400ml",productCategory,16,40.5);
        Product product1 = new Product("1","霸王洗发水100ml",productCategory,0,40.5);
        product.showInfo();
        System.out.println("_______________________________________________________");
        product1.showInfo();*/
        /*第六题*//*
        //book
        Book book = new Book("鹿鼎记","金庸","人民文学出版社",120.0);
        Book book1 = new Book("绝代双骄","古龙","中国长安出版社",55.5);
        book.showInfo();
        System.out.println("________________________________________________________________________________________");
        book1.showInfo();*/
        /*第七题*//*
        //Student
        Student stu = new Student("阿宝",25,"男","s23401");
        Student stu1 = new Student("郭美美",21,"男","y12302");

        stu.showInfo("北京大学","英国哲学专业");
        System.out.println("___________________________________________________");
        stu1.showInfo("清华大学","原子物理专业");*/
        /*第九题*//*
        //Skill和Hero
        Skill fireball = new Skill("Fireball", 5, 3, 2);
        Skill firegun = new Skill("Firegun", 10, 6, 1);
        Hero hero = new Hero("李小侠",300,80,30,fireball);
        hero.attack(hero);
        hero.defend(80);
        hero.learnNewSkill(firegun);*/
        System.out.println(random());

    }


}
