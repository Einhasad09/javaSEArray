package homework0810.h18w3;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;

public class Test {
    /*
    * 分别使用文件流和缓冲流复制一个长度大于100MB的视频文件，并观察效率的差异。
    * */
    public static void main(String[] args) throws IOException {

        HomeWork3();
        HomeWork33();
    }
    public static void HomeWork3() throws IOException {
        File inputFile = new File("C:\\Users\\HP\\Videos\\video01.mp4");
        File outputFile = new File("F:\\JavaPro\\video01.mp4");
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        long startTime = System.currentTimeMillis();
        byte[] bt = new byte[1024*768];
        int length = fis.read(bt);
        while(length!=-1){
            fos.write(bt);
            length = fis.read(bt);
        }
        fos.close();
        fis.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File总共用时:"+(endTime - startTime));

    }
    public static void HomeWork33() throws IOException {
        File inputFile = new File("C:\\Users\\HP\\Videos\\video01.mp4");
        File outputFile = new File("F:\\JavaPro\\JavaPro1\\video01.mp4");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        long startTime = System.currentTimeMillis();
        String str = br.readLine();
        while(str!=null){
            bw.write(str);
            str = br.readLine();
        }
        bw.close();
        br.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Buffer总共用时:"+(endTime - startTime));

    }
}
