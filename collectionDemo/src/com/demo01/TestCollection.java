package com.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
    public static void main(String[] args) {
        /*抽象类只能 实现类
        * collection是容器
        * 以下是共有方法：
        * 添加:add()  collection1.addAll(collection)
        * 删除:remove()   collection1.removeAll(collection) clear()
        * 修改:
        * 取出来：——————没有
        * 迭代器：循环遍历
        * 这个迭代器实现的是collection1的迭代器接口
        * Iterator iterator = collection1.iterator();
          while (iterator.hasNext()){
            System.out.println("元素值："+iterator.next());
          }
        * 查看:size()     toString()
        * 判断:isEmpty()  contains()      collection1.collectionAll(collection)完全都拥有才返回真
        * 转数组：toArray()
        * */
        Collection collection = new ArrayList();
        collection.add("张三");
        collection.add(34);//自动装箱
        collection.add(true);
        collection.add('a');
        Collection collection1 = new ArrayList();
        System.out.println("addAll调用前："+collection1.isEmpty());
        collection1.addAll(collection);
        System.out.println("addAll调用后："+collection1.isEmpty());
        System.out.println("collection1里有"+collection1.size()+"个元素");

        collection1.remove("张三");
        System.out.println("remove后："+collection1);//重写toString方法
        collection1.add("星期三");
        //collection1.removeAll(collection);
        System.out.println(collection1);
        System.out.println("判断"+collection1.contains("李四"));

        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()){
            System.out.println("元素值："+iterator.next());
        }

    }
}
