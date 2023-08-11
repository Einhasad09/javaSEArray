package homework0803.bid;

public class Bird {
    /**
     * 1、请使用面向对象的思想，设计自定义类描述麻雀和企鹅的信息
     * 2、分析麻雀和企鹅的公共成员，提取出父类---鸟类
     * 3、利用继承机制，实现麻雀类和企鹅类
     * 4、利用封装机制，设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问 5、 编写测试类，分别测试鸟类，麻雀类和企鹅类的对象及相关方法（测试数据信息自定） 6、 定义名为bid的包存放鸟类、麻雀类、企鹅类和测试类
     *
     * 参考分析思路：
     * 麻雀类：
     * 属性包括：名字，颜色
     * 方法包括：飞，吃
     *
     * 企鹅类：
     * 属性包括：名字，颜色
     * 方法包括：飞，吃，游泳
     * */

    private String name;
    private String color;

    public Bird() {
    }

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fly(){
        System.out.println("我是鸟，我会飞");
    }
    public void eat(){
        System.out.println("哥吃的不是虫子，是寂寞");
    }
}
