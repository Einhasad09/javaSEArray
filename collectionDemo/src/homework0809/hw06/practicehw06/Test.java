package homework0809.hw06.practicehw06;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    /**
     * 6.由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，
     ** 当输入的内容为exit退出；将输入的学生信息分别封装到一个Student对象中，
     ** 再将每个Student对象加入到一个集合中，要求 集合 中的元素按照年龄大小正序排序；最后遍历集合，
     ** 将集合中学生信息写入到记事本，每个学生数据占单独一行。
     * */
    public static void main(String[] args) {
        Set<Student> stuSet = saveStudentInfo();
        Iterator iterator = stuSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
    public static Set<Student> saveStudentInfo(){
        Scanner input = new Scanner(System.in);
        Set<Student> stuSet = new TreeSet<>();
        while(true){
            System.out.println("请按学号#姓名#年龄信息的格式输入");
            String inputData = input.nextLine();
            if(inputData.equals("exit")){
                break;
            }
            String[] info = inputData.split("#");
            stuSet.add(new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2])));
        }
        return stuSet;
    }
}
