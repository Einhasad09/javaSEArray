package day0803;

public class Person {
    private String name;
    int age;
    protected String sex;
    public String phone;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
        System.out.println("父类无参构造");
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

    public void info(){
        System.out.println(name+";"+age+";"+sex+";");
    }

    public void eat(){
        System.out.println("eat");
    }
    protected void drink(){
        System.out.println("drink");
    }
    void talk(){
        System.out.println("talk");
    }
    private void sleep(){
        System.out.println("sleep");
    }
}

