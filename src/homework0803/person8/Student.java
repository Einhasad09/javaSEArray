package homework0803.person8;

public class Student extends Person{
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
    String stuId;//学号

    public Student(String name, int age, String sex, String stuId) {
        super(name, age, sex);
        this.stuId = stuId;
    }
    public Student(){}

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Student(String stuId) {
        this.stuId = stuId;
    }
    public void study(){
        System.out.println("我叫"+getName()+",今年"+getAge()+"岁");
        System.out.println("我的学号是"+getStuId());
        System.out.println("作为学生我的职责就是：好好学习，天天向上");
    }

    public void sleep(){
        System.out.println("作为一个好学生，一定要写完作业再睡觉");
    }
}
