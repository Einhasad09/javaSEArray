package com.demo01;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        /*
        * Set接口存储的元素无序唯一(去重)
        * HashSet()实现类
        * *//*
        Set set = new HashSet();
        set.add("123");
        set.add("123");
        set.add("qwe");
        System.out.println(set.size());*/

        //HashSet()实现类
        /*
        * 所以，用hashset集合存储的元素，要求元素必须重写hashcode和equals方法*/
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(34);
        hashSet.add(45);
        hashSet.add(34);
        hashSet.add(34);
        System.out.println(hashSet.size());

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("张三");
        hashSet1.add("张三");
        hashSet1.add("李四");
        hashSet1.add("王五");
        System.out.println(hashSet1.size());

        HashSet<Student> hashSet2 = new HashSet<>();
        hashSet2.add(new Student(1,"张三",20,"男"));
        hashSet2.add(new Student(1,"张三",20,"男"));
        hashSet2.add(new Student(2,"李四",22,"女"));
        System.out.println(hashSet2.size());
        System.out.println(hashSet2);

    }
}
