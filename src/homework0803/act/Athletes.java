package homework0803.act;

public class Athletes extends Person{
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
    private String sport;
    private String grade;

    public Athletes(String name, int age, String sex, String sport, String grade) {
        super(name, age, sex);
        this.sport = sport;
        this.grade = grade;
    }
    public Athletes(){}

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void introduce(){
        System.out.println("Hello! I'm"+getName());
        System.out.println("i am "+getAge()+"years old");
        System.out.println("我最擅长的运动项目是："+getSport());
        System.out.println("历史最好成绩是："+getGrade());
    }
}
