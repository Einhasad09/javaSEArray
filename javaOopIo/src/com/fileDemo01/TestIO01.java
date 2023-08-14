package com.fileDemo01;

import java.io.*;

public class TestIO01 {
    public static void main(String[] args) throws IOException {
        //outputIO();
        //inputIO();
        //ioDemo();
    }
    public static void ioDemo() throws IOException {
        //用字节输入/输出流复制一张图片
        /*
        * 1.准备数据源对象*/
        File inFile = new File("C:\\Users\\HP\\Desktop\\DNF.png");
        File outFile = new File("F:\\JavaPro\\DNF.png");
        //2.创建管道，连接数据源
        FileInputStream fis = new FileInputStream(inFile);
        FileOutputStream fos = new FileOutputStream(outFile);

        //3.读取数据，同时写入
        //int i = fis.read();
        byte[] bs = new byte[1024*768];//一个容器
        int length = fis.read(bs);//返回值是，读到数组的实际元素个数
        int count = 0;
        while(length!=-1){
            fos.write(bs);//从bs里写出去
            length=fis.read(bs);//读到bs里面
            count++;
        }
        System.out.println("读取了"+count+"遍");
        //4.关闭读写流资源
        fos.close();
        fis.close();
        System.out.println("复制图片结束！");
    }
    public static void inputIO() throws IOException {
        /*
         * 1.创建数据源对象
         * 2.创建管道，连接数据源
         * 3.(自动打开)读取数据 read()方法
         * 4.关闭 流资源
         * */

        //创建数据源对象
        File file = new File("F:\\JavaPro\\1234.txt");
        //创建管道，连接数据源（输入字节流）
        FileInputStream fis = new FileInputStream(file);
        //读取数据 read()方法
        int i = fis.read();
        while(i!=-1){
            System.out.print((char)i);
            i=fis.read();
        }
        //关闭 流资源
        fis.close();
    }
    public static void outputIO() throws IOException {
        /*
        * 1.创建数据源对象
        * 2.创建管道，连接数据源对象(输出字节流)
        * 3.写入数据 write()
        * 4.关闭 流资源*/

        //创建数据源对象
        File file = new File("F:\\JavaPro\\1234.txt");
        //创建管道，连接数据源
        //append: 默认是假(覆盖原有值) 真(原有基础上追加)
        FileOutputStream fos = new FileOutputStream(file,true);
        //写入数据
        fos.write('!');
        //关闭流资源
        fos.close();
        System.out.println("写入数据结束！");
    }
}
