package homework0809.hw06;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /**
         * * 6.由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，
         * 当输入的内容为exit退出；将输入的学生信息分别封装到一个Student对象中，
         * 再将每个Student对象加入到一个集合中，要求 集合 中的元素按照年龄大小正序排序；最后遍历集合，
         * 将集合中学生信息写入到记事本，每个学生数据占单独一行。
         * 推荐步骤：
         * a)创建Student类，并指定按照年龄正序排列
         * b)通过控制台输入多个不同Student信息。格式规定为：编号#姓名#年龄
         * c)取出字符串中相应信息放入Student对象，并将Student加入到集合中
         * d)遍历集合的过程中将学生的信息输入到记事本
         */
        Set<Student> stuSet = saveStudentInfo();
        Iterator iterator = stuSet.iterator();
        while (iterator.hasNext()){
            String info = iterator.next().toString();
            System.out.println(info);
        }
    }
    private static Set<Student> saveStudentInfo(){
        Scanner input = new Scanner(System.in);
        Set<Student> stuSet = new TreeSet<>();
        while(true){
            System.out.println("请输入学生信息:(学号#姓名#年龄)");
            String inputData = input.nextLine();
            if(inputData.equals("exit")){
                break;
            }
            String[] info = inputData.split("#");
            Student stu = new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
            stuSet.add(stu);
        }
        return stuSet;
    }
}
