package com.ArraySetMap.List11;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        //IteratorTest();
        HashMapTest();
    }
    public static void IteratorTest(){
        ArrayList list = new ArrayList();
        list.add("qqqq");
        list.add("wwww");
        list.add("eeee");
        list.add("rrrr");
        /*循环遍历*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("——————循环遍历——————");
        /*增强for*/
        for(Object o : list){
            System.out.println(o);
        }
        System.out.println("——————增强for——————");
        /*迭代器进行遍历*/
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("——————迭代器进行遍历——————");
    }
    public static void HashMapTest(){
        HashMap<Integer,Student> map2 = new HashMap<>();
        Student stu = new Student(1,"张三",23,"男");
        Student stu1 = new Student(1,"张三",23,"男");
        Student stu2 = new Student(2,"李四",24,"女");
        Student stu3 = new Student(3,"王五",25,"男");
        map2.put(stu.getStuId(),stu);
        map2.put(stu1.getStuId(),stu1);
        map2.put(stu2.getStuId(),stu2);
        map2.put(stu3.getStuId(),stu3);
        //方法1.迭代器
        Set<Integer> set = map2.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(map2.get(iterator.hasNext()));
        }
        System.out.println("__________________________________________");
        //方法2.增强for
        Set<Integer> set1 = map2.keySet();
        for(Integer i:set1){
            System.out.println(map2.get(i));
        }
        System.out.println("__________________________________________");
        //方法3.直接拿value
        Collection<Student> collection = map2.values();
        for(Student student : collection){
            System.out.println(student);
        }
        System.out.println("__________________________________________");
        //方法4.Entry
        Set<Map.Entry<Integer,Student>> entries =map2.entrySet();
        for(Map.Entry<Integer,Student> entry : entries){
            System.out.println(entry.getValue());
        }
    }
}
