package homework0803.doc;

public class Person {
    /**
     * 1、请使用面向对象的思想，设计自定义类描述医生和军人类
     * 2、分析医生和军人的公共成员，提取出父类---人类
     * 3、利用继承机制，实现医生类和军人类
     * 4、利用封装机制，设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问 5、 编写测试类，分别测试人类，医生类和军人类的对象及相关方法（测试数据信息自定） 6、 定义名为doc的包存放人类、医生类、军人类和测试类
     *
     * 参考分析思路：
     * 医生类：
     * 属性包括：姓名，年龄，性别，所在科室，职务
     * 方法包括：工作
     *
     * 军人类： 属性包括：姓名，年龄，性别，所属部队，职务，军龄
     * 方法包括：工作
     * */
    private String name;
    private int age;
    private String sex;
    private String duty;//职务

    public Person(String name, int age, String sex, String duty) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.duty = duty;
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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void work(){
        System.out.println("我是普通人，要工作才有饭吃");
    }
}
