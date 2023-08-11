package com.fileDemo01;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        //没写具体路径的话从当前运行类的路径下算地址
        File file = new File("//F:\\JavaPro\\Demo01.java");
        File file1 = new File("F:/JavaPro/Demo1.java");
        File file2 = new File("F:\\JavaPro");

        //file代表文件也代表目录
        if(file2.isFile()){//判断是否是文件
            if(file.exists()){//判断文件是否存在
                System.out.println("文件名："+file.getName());
                System.out.println("文件大小："+file.length());
                System.out.println("文件地址："+file.getPath());
                System.out.println("文件是否可编辑："+file.canWrite());
                /*//绝对路径从根盘符往下找路径/从当前项目开始
                //相对路径 从当前项目 相同的位置去掉 从不同的地方开始找
                System.out.println("文件的绝对路径："+file.getAbsolutePath());
                System.out.println("文件的相对路径："+file.getPath());*/
            }else{
                System.out.println("文件不存在！已经帮忙创建！");
                file.createNewFile();
            }
        }else if(file2.isDirectory()){//判断是否是目录
            if(file2.exists()){//判断目录是否存在
                System.out.println("目录名字："+file2.getName());
                System.out.println("目录地址："+file2.getPath());
                File[] files = file2.listFiles();
                for(File f:files){
                    System.out.println("\t\t"+f.getName());
                }
            }else{
                //file.mkdir();//创建单层目录
                file2.mkdirs();//创建多层目录
                file2.delete();//删除目录
            }
        }



    }
}
