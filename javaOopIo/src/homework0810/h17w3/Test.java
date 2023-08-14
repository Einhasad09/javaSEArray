package homework0810.h17w3;

import java.io.*;

public class Test {
    /*
    * 复制文件夹d:/ccjrjava下面所有文件和子文件夹内容到d:/ccjrjava2
    * 提示：涉及单个文件复制、目录的创建、递归的使用
    * */
    public static void main(String[] args) {

    }
    public static void HomeWork() throws FileNotFoundException {
        File inputFile = new File("F:\\JavaPro");
        File outputFile = new File("F:\\JavaPro\\JavaPro1");


        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        File[] files = inputFile.listFiles();
        for(File file:files){

        }

    }
}
