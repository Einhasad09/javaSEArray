package com.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("qqqq");
        list.add("wwww");
        list.add("eeee");
        list.add("rrrr");
        /*循环遍历*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*增强for*/
        for(Object o : list){
            System.out.println(o);
        }
        /*迭代器进行遍历*/
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
