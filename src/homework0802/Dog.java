package homework0802;

public class Dog {
    /**
     * 1、使用面向对象的思想，编写自定义类描述狗的信息。
     * 2、设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问
     * 3、限定心情只能是“心情好”和“心情不好”两种情况，如果无效需进行提示 ，默认设置“心情好”
     * 4、设计构造函数实现对属性赋值
     * 5、叫和跑的方法，需要根据心情好坏，描述不同的行为方式
     * 6、 编写测试类，测试狗类的对象及相关方法（测试数据信息自定）
     *
     * 参考分析思路：
     * 狗类：
     * 属性包括： 品种，年龄，心情，名字；
     * 方法包括： 叫，跑
     * */
    private String type;
    private int age;
    private String mood;//心情好、心情不好
    private String name;

    public Dog(String type, int age, String mood, String name) {
        setType(type);
        setAge(age);
        setMood(mood);
        setName(name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        if(!mood.equals("心情很好")&&!mood.equals("心情不好")){
            System.out.println("输入信息错误，这只狗狗今天心情很好");
            this.mood = "心情很好";
        }else{
            this.mood = mood;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark(){
        if(getMood().equals("心情很好")){
            System.out.println("名字叫"+getName()+"的"+getType()+getMood()+"开心地汪汪叫");
        }else{
            System.out.println("名字叫"+getName()+"的"+getType()+getMood()+"伤心地呜呜叫");
        }
    }
    public void run(){
        if(getMood().equals("心情很好")){
            System.out.println("名字叫"+getName()+"的"+getType()+getMood()+"开心地围着主人身边转");
        }else{
            System.out.println("名字叫"+getName()+"的"+getType()+getMood()+"伤心地一动不动");
        }
    }
}
