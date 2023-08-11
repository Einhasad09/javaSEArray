package day0802;

public class Student {
    static int num;/*存储班级里学生人数*/
    private static String name;

    public Student(int num,String name) {
        this.num = num;
        this.name = name;
    }

    public Student() {
        num++;
    }

    public void showNum(){
        System.out.println("现在班级里有"+num+"人");
    }
    public static void introduce(){
        System.out.println("大家好！我是" + name);
    }
}
