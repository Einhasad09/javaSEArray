package com.demo02;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        /*HashMap:实现类：一对一对存储数据
        * 添加：put
        * 删除：remove
        * 取出：get
        * 替换：replace
        * 四种遍历：
        * 通过键获得值：两种遍历方式
        * 直接获得值
        * 通过entry
        * */
        //key是integer   value是integer
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,23);//添加
        map.put(1,24);
        map.put(2,25);
        map.put(2,25);

        //key--Stirng value--Integer
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("01",23);
        map1.put("02",24);
        map1.put("02",23);

        //key--Student  value--Integer
        HashMap<Integer,Student> map2 = new HashMap<>();
        Student stu = new Student(1,"张三",23,"男");
        Student stu1 = new Student(1,"张三",23,"男");
        Student stu2 = new Student(2,"李四",24,"女");
        Student stu3 = new Student(3,"王五",25,"男");
        map2.put(stu.getStuId(),stu);
        map2.put(stu1.getStuId(),stu1);
        map2.put(stu2.getStuId(),stu2);
        map2.put(stu3.getStuId(),stu3);
        //System.out.println(map2);

        map2.remove(stu3.getStuId());
        //System.out.println(map2);
        //System.out.println(map2.get(stu2.getStuId()));

        map2.replace(stu2.getStuId(),new Student(3,"王五",25,"男"));
        //ystem.out.println(map2);
        //四种遍历

        //方法1.迭代器
        Set<Integer> set = map2.keySet();//获得 存储所有Key的Set集合
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(map2.get(iterator.next()));
        }

        System.out.println("__________________________________________");
        //方法2.增强for
        Set<Integer> set1 = map2.keySet();//获得 存储所有Key的Set集合
        for(Object o : set1){
            System.out.println(map2.get(o));
        }

        System.out.println("__________________________________________");
        //方法3.直接拿value
        Collection<Student> collection = map2.values();
        for(Student student:collection){
            System.out.println(student);
        }

        System.out.println("__________________________________________");
        //方法4.
        Set<Map.Entry<Integer,Student>> set2= map2.entrySet();
        for(Map.Entry<Integer,Student> entry:set2){
            System.out.println(entry.getValue());
        }

    }
}
