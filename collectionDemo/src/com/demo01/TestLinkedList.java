package com.demo01;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /*
        * 特有方法：
        * 添加：addFirst() addLast() offer()在末尾添加元素同时返回true
        * 删除：removeLast() removeFirst() pop()删除并返回链表中第一个元素
        *
        * 获取：get() getFirst()  getLast()
        * */
        list.add("zhangSan");
        list.add(0,"liSi");
        list.addFirst("wangWu");
        list.addLast("laoLiu");
        list.addFirst("wangWu");
        list.addLast("laoLiu");
        list.addFirst("wangWu");
        list.addLast("laoLiu");

        list.removeLast();
        list.get(5);
        System.out.println(list);
        list.offer("yiyi");
        System.out.println(list);
    }
}
