package homework0803.person8;

public class Person {
    /**
     * 1、请使用面向对象的思想，设计自定义类描述学生和老师类
     * 2、分析学生和老师的公共成员，提取出父类---人类
     * 3、利用继承机制，实现学生类和老师类
     * 4、利用封装机制，设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问
     * 5、 编写测试类，分别测试人类，学生类和老师类的对象及相关方法（测试数据信息自定）
     *
     * 参考分析思路：
     * 学生类：
     * 属性包括：姓名，年龄，性别，学号
     * 方法包括：学习，睡觉
     *
     * 老师类：
     * 属性包括：姓名，年龄，性别，所教科目，教龄
     * 方法包括：授课，睡觉
     * */

    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep(){
        System.out.println("我是普通人，要工作才有饭吃");
        System.out.println("我是普通人，吃饱了就睡");
    }
}
