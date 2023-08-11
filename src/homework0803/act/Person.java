package homework0803.act;

public class Person {
    /**
     * 1、请使用面向对象的思想，设计自定义类描述演员和运动员
     * 2、分析演员和运动员的公共成员，提取出父类---人类
     * 3、利用继承机制，实现演员类和运动员类
     * 4、利用封装机制，设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问 5、 编写测试类，分别测试人类，演员类和运动员类的对象及相关方法（测试数据信息自定） 6、 定义名为act的包存放人类、演员类、运动员类和测试类
     *
     * 参考分析思路：
     * 演员类：
     * 属性包括：姓名，年龄，性别，毕业院校，代表作
     * 方法包括：自我介绍
     *
     * 运动员类：
     * 属性包括：姓名，年龄，性别，运动项目，历史最好成绩
     * 方法包括：自我介绍
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

    public void introduce(){
        System.out.println("我就是一个普通老百姓");
    }
}
