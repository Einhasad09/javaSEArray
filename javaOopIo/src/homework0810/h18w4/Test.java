package homework0810.h18w4;

import java.io.*;
import java.util.ArrayList;

public class Test {
    /*
    * 使用IO包中的类读取D盘上exam.txt文本文件的内容
    * 每次读取一行内容
    * 将每行作为一个输入放入ArrayList的泛型集合中并将集合中的内容使用加强for进行输出显示
    * */
    public static void main(String[] args) throws IOException {
        HomeWork4();
    }
    public static void HomeWork4() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File("F:\\JavaPro\\exam.txt");
        FileReader fr = new FileReader(file);
        BufferedReader bf = new BufferedReader(fr);

        String str = null;
        while((str=bf.readLine())!=null){
            arrayList.add(str);
        }
        for(String string : arrayList){
            System.out.println(string);
        }
        bf.close();
    }
}
