package com.demo01;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1234");
        list.add("qwr");
        list.add(543);

        System.out.println("查找wqe所在下标位置"+list.indexOf("qwr"));
        //list.sort();//根据传入的比较器排序
        list.set(1,"0000");
        System.out.println(list);
        System.out.println(list.subList(0, 1));//获得指定范围内的元素 左闭右开
        System.out.println("clone(): "+list.clone());

    }
}
