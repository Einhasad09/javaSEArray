package homework0802;

public class Student {
    /**
     * 1、以面向对象的思想，编写自定义类描述学生。
     * 2、设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问
     * 3、设计构造函数实现对所有属性赋值
     * 4、学习方法通过输入参数，接收就读学校和所学专业，输出个人的学习信息
     * 5、 编写测试类，测试学生类的对象及相关方法（测试数据信息自定）
     *
     * 参考思路分析：
     * 学生类：
     * 属性包括：姓名，年龄，性别，学号；
     * 方法包括：学习
     * */
    String stuName;//姓名
    int stuAge;
    String sex;
    String stuId;//学号

    public Student(String stuName, int stuAge, String sex, String stuId) {
        setStuName(stuName);
        setStuAge(stuAge);
        setSex(sex);
        setStuId(stuId);
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void showInfo(String collegue,String major){
        System.out.println("大家好，我叫"+getStuName()+",今年"+getStuAge());
        System.out.println("我现在就读于"+collegue+"---"+major);
        System.out.println("我的学号是"+getStuId());
    }
}
