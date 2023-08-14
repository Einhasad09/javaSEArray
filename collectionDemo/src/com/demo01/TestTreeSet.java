package com.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(45);
        set.add(457);
        set.add(47);
        set.add(4);
        System.out.println(set);

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("张三");
        set1.add("qwe");
        set1.add("qwe");
        set1.add("张三");
        System.out.println(set1);
        /**
         * TreeSet存储唯一元素的原理：
         * 底层是二叉树！
         * 借助比较器模拟二叉树的三种结果：0相等 -1小于 1大于
         * */
        /*TreeSet<Student> set2 = new TreeSet<>();
        set2.add(new Student(1,"张三",23,"男"));
        set2.add(new Student(1,"李四",23,"男"));
        set2.add(new Student(2,"李四",24,"女"));
        System.out.println(set2);*/

        TreeSet<Student> set3 = new TreeSet<>(new StudentRanking());
        set3.add(new Student(1,"李四",23,"男"));
        set3.add(new Student(2,"李四",23,"男"));
        set3.add(new Student(3,"李四",24,"女"));
        System.out.println(set3);
    }
}
