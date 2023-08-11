package homework0803.act;

public class Actor extends Person{
    /**
     ** 参考分析思路：
     ** 演员类：
     ** 属性包括：姓名，年龄，性别，毕业院校，代表作
     ** 方法包括：自我介绍
     **
     ** 运动员类：
     ** 属性包括：姓名，年龄，性别，运动项目，历史最好成绩
     ** 方法包括：自我介绍
     * */
    private String collegue;
    private String work;

    public Actor(String name, int age, String sex, String collegue, String work) {
        super(name, age, sex);
        this.collegue = collegue;
        this.work = work;
    }

    public Actor() {}

    public String getCollegue() {
        return collegue;
    }

    public void setCollegue(String collegue) {
        this.collegue = collegue;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void introduce(){
        System.out.println("Hello! I'm"+getName());
        System.out.println("i am "+getAge()+"years old");
        System.out.println("我毕业于："+getCollegue());
        System.out.println("代表作有：《"+getWork()+"》");
    }
}
