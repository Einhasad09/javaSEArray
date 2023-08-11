package homework0803.person8;

public class Teacher extends Person{

    String teachCourse;//所教科目
    int teachYear;//教龄

    public Teacher(String name, int age, String sex, String teachCourse, int teachYear) {
        super(name, age, sex);
        this.teachCourse = teachCourse;
        this.teachYear = teachYear;
    }
    public Teacher(){}

    public String getTeachCourse() {
        return teachCourse;
    }

    public void setTeachCourse(String teachCourse) {
        this.teachCourse = teachCourse;
    }

    public int getTeachYear() {
        return teachYear;
    }

    public void setTeachYear(int teachYear) {
        this.teachYear = teachYear;
    }

    /**
     ** 参考分析思路：
     ** 学生类：
     ** 属性包括：姓名，年龄，性别，学号
     ** 方法包括：学习，睡觉
     **
     ** 老师类：
     ** 属性包括：姓名，年龄，性别，所教科目，教龄
     ** 方法包括：授课，睡觉
     * */

    public void teach(){
        System.out.println(getName()+"老师，今年"+getAge()+"岁");
        System.out.println("教授"+getTeachCourse()+",它具有"+getTeachYear()+"教龄");
    }

    public void sleep(){
        System.out.println("作为一个好老师，一定要先备课，再睡觉");
    }
}
