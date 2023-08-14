package com.fileDemo01;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class TestCharIO {
    public static void main(String[] args) throws IOException {
        //inputIO();
        //outputIO();
    }

    public static void inputIO() throws IOException {
        File file = new File("F:\\JavaPro\\12345.txt");

        FileReader fr = new FileReader(file);

        char[] ch = new char[1024];
        int i = fr.read(ch);
        while(i!=-1){
            String str = new String(ch,0,i);
            System.out.println(str);
            /*System.out.print(ch);*/
            i = fr.read(ch);
        }

        fr.close();
    }
    public static void outputIO() throws IOException {
        //从控制台循环接收一句话，然后存储到物理文件里
        Scanner input = new Scanner(System.in);
        //1.创建数据源对象
        File file = new File("F:\\JavaPro\\1234.txt");
        FileWriter fw = new FileWriter(file,true);

        while(true){
            System.out.println("please input a sentense:");
            String str = input.next();
            if(!str.equals("exit")){
                fw.write(str);
                fw.write("\n");
                fw.flush();
            }else{
                break;
            }
        }
        fw.close();
    }

}
