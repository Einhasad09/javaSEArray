package homework0810.h18w7;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    /*
    * 7.由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
    * 将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，
    * 要求集合中的元素按照年龄大小正序排序；
    * 最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。
    * */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HomeWork07();
    }
    public static void HomeWork07() throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        TreeSet<Student> treeSet = new TreeSet<>();
        while (true){
            System.out.println("请按学号#姓名#年龄信息的样式输入，输入exit退出");
            String str = input.next();
            if(str.equals("exit")){
                break;
            }else{
                String[] splitStr = str.split("#");
                System.out.println("splitStr"+splitStr.length);
                if(splitStr.length==3){
                    String id = splitStr[0];
                    String name = splitStr[1];
                    int age =Integer.parseInt(splitStr[2]);
                    treeSet.add(new Student(id,name,age));
                }
            }
        }
        for(Student stu:treeSet){
            System.out.println(stu);
        }
        //数据源对象
        File file = new File("F:\\JavaPro\\h18w07.txt");
        //节点流
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //写入记事本student
        //oos.writeObject(treeSet);
        for(Student student:treeSet){
            oos.writeObject(student);
        }
        System.out.println("输出完毕");
        //关闭 流资源
        oos.close();
        System.out.println("________________________________________");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (true){
            try{
                Student stu =(Student)ois.readObject();
                System.out.println(stu);
            }catch (EOFException e){
                break;
            }
        }
        ois.close();
    }
}
