package com.fileDemo01;

import java.io.*;

public class TestBufferIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //BufferTest();
        //TransTest();
        //DataTest();
        //DataOutTest();
        //ObjectTest();
        inputObjectTest();

    }

    //对象流
    public static void ObjectTest() throws IOException {
        //将学生对象存储到物理文件里
        //创建数据源对象
        File inputFile = new File("F:\\JavaPro\\qwe.txt");

        //创建管道、连接数据源
        FileOutputStream fos = new FileOutputStream(inputFile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //写入
        Student student = new Student(1,"张三",21);
        oos.writeObject(student);
        System.out.println("写入完毕");
        //关闭
        oos.close();

    }
    public static void inputObjectTest() throws IOException, ClassNotFoundException {
        //将学生对象存储到物理文件里
        //创建数据源对象
        File inputFile = new File("F:\\JavaPro\\qwe.txt");

        //创建管道、连接数据源
        FileInputStream fis = new FileInputStream(inputFile);
        ObjectInputStream ois = new ObjectInputStream(fis);

        //读数据
       Student stu = (Student)ois.readObject();
        System.out.println(stu);
        //关闭
        ois.close();
    }

    //对象流、

    //数据流、输出————基本数据类型
    public static void DataTest() throws IOException {
        //存储整型、布尔型、到文件里
        File inputFile = new File("F:\\JavaPro\\qwe.txt");

        //创建管道、连接数据源
        FileOutputStream fos = new FileOutputStream(inputFile);
        DataOutputStream dos = new DataOutputStream(fos);

        //写入数据、保存类型
        dos.writeUTF("dz10 ban");
        dos.writeChar('男');
        dos.writeBoolean(true);
        dos.writeInt(100);

        //关闭资源
        dos.close();

    }

    public static void DataOutTest() throws IOException {
        File inputFile = new File("F:\\JavaPro\\qwe.txt");

        //创建管道、连接数据源
        FileInputStream fos = new FileInputStream(inputFile);
        DataInputStream dos = new DataInputStream(fos);

        //读数据：按写入数据、保存类型
        System.out.println("String str = "+dos.readUTF());
        System.out.println("Char char = "+dos.readChar());
        System.out.println("Boolean boolean = "+dos.readBoolean());
        System.out.println("Int int = "+dos.readInt());

        //关闭资源
        dos.close();
    }

    //转换流——过渡
    private static void TransTest() throws IOException {
        //创建数据源对象
        File inputFile = new File("F:\\JavaPro\\12345.txt");
        File outputFile = new File("C:\\Users\\HP\\Desktop\\12345.txt");

        //准备管道 连接数据源
        FileInputStream fis = new FileInputStream(inputFile);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream(outputFile);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        //读写
        String str = br.readLine();
        while(str!=null){
            bw.write(str);
            bw.newLine();
            str = br.readLine();
        }
        System.out.println("文件复制完毕！");
        //关闭资源
        br.close();
        bw.close();





    }

    //缓冲流
    public static void BufferTest() throws IOException {
        //将文件复制到桌面
        //创建数据源对象
        File inputFile = new File("F:\\JavaPro\\1234.txt");
        File outputFile = new File("C:\\Users\\HP\\Desktop\\1234.txt");

        //创建节点流
        FileReader fr = new FileReader(inputFile);
        FileWriter fw = new FileWriter(outputFile);

        //创建处理流
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        //读写
        String str = br.readLine();
        while(str!=null){
            bw.write(str);//一次读一行
            bw.newLine();
            str = br.readLine();
        }
        System.out.println("文件复制完成！");
        //关闭
        bw.close();
        br.close();
    }



}
