package com.Int;

import javax.xml.transform.Source;

public class TestStringBuilder {
    public static void main(String[] args) {


    }

    public static void method02(){
        StringBuffer sbu = new StringBuffer("qwertyui");
        sbu.append("1111");//地址不变里面的内容变
        System.out.println(sbu);
        System.out.println(sbu == sbu.append("aaa"));//拼接
        System.out.println(sbu);

        System.out.println("delete:"+sbu.delete(3,9));//左闭右开区间
        System.out.println("CharAt:"+sbu.deleteCharAt(4));//删除参数下标位置的元素
        System.out.println("insert:"+sbu.insert(3,"888"));//在目标位置插入
        System.out.println("reverse:"+sbu.reverse());//逆序
        System.out.println("replace:"+sbu.replace(7,10,"666"));//替换、左闭右开
        sbu.setCharAt(3, '!');//3下标位置换成感叹号
        System.out.println("setCharAt:"+sbu);

    }

    public static void method01(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = new StringBuilder("123456");//  String~~~StringBulider

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("124578");

        StringBuilder stringBuilder2 = new StringBuilder("456789132");
    }
}
