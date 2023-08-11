package test;

public class Actor extends Person{
    private String privateWork;//代表作品
    private String graduateSchool;//毕业院校

    public Actor(String name, int age, String gender, String privateWork, String graduateSchool) {
        super(name, age, gender);
        this.privateWork = privateWork;
        this.graduateSchool = graduateSchool;
    }

    public String getPrivateWork() {
        return privateWork;
    }

    public void setPrivateWork(String privateWork) {
        this.privateWork = privateWork;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    @Override
    public void showInfo() {
        System.out.println("大家好！我是"+getName());
        System.out.println("今年"+getAge());
        System.out.println("我毕业于："+getGraduateSchool());
        System.out.println("代表作有：《"+getPrivateWork()+"》");
    }
}
