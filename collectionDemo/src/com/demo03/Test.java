package com.demo03;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        ArrayList<String> list1= new ArrayList<>();
        //addAll(Collection集合下的子类，元素列表...)
        Collections.addAll(list,"12","1dfsf","555","dfsf");
        System.out.println(list);
        //sort(list集合)
        Collections.sort(list);
        System.out.println(list);
        //binarySearch(list集合，要查找的目标)
        System.out.println(Collections.binarySearch(list, "555"));
        //copy(list1,list)  list复制到list1  list1的长度大于等于list
        Collections.addAll(list1,"12","1dfsf","555","dfsf");
        Collections.copy(list1,list);
        System.out.println(list1);

    }
}
