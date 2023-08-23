package com.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        /*List接口：有序、不唯一
         * 添加：add(一个参数)  add(两个参数)  addAll()
         * 删除：remove(下标/元素内容) clear
         * 修改：
         * 查找：
         * 判断：
         * 转数组：
         * 替换：
         * 取出
         * 迭代器：遍历
         * Iterator iterator = list.iterator();
           while (iterator.hasNext()){
               System.out.println(iterator.next());
           }*/
        List list = new ArrayList();
        list.add("张三");
        list.add(true);
        list.add(34);

        list.add(0,"李四");
        list.add(4,"王五");
        list.remove(3);
        list.remove(new Integer(34));

        System.out.println(list.get(3));
        list.set(3,"李思思");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(list.isEmpty());

        System.out.println(list.get(0));


    }
}
