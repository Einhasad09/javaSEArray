package homework0810.h18w6;

import java.io.*;
import java.util.Arrays;

public class Test {
    /**
     * 5.假设从入学开始所有书写的Java类代码都在d:/ccjrjava文件夹下，包括多级子文件夹。
     * 使用IO流获取从入学开始，到目前为止已经写了多少行Java代码。
     *
     * 提示：其实就是获取d:/ccjrjava文件夹及其子文件夹下的所有.java文件
     * 使用readLine()读取其中每一行，每读取一行，行数加1。所有的文件读取完毕，得到总共已经写的Java代码行数。
     * 需要结合递归实现
     * */
    private static int line = 0;
    public static void main(String[] args) throws IOException {
        //创建数据源对象
        File file = new File("F:\\JavaPro");
        HomeWork06(file);
        System.out.println("总行数为 "+line);
    }
    public static void HomeWork06(File file) throws IOException {
        File[] files = file.listFiles();
        System.out.println("获取目录和文件："+Arrays.toString(files));
        if(files!=null){
            for(File file1:files){
                if(file1.isDirectory()){
                    HomeWork06(file1);
                }else{
                    if(file1.getName().toLowerCase().endsWith(".java")){
                        BufferedReader br = new BufferedReader(new FileReader(file1));
                        while(br.readLine()!=null){
                            line++;
                        }
                        br.close();
                    }
                }
            }
        }
    }
}
