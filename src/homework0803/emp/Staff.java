package homework0803.emp;

public class Staff {

    private String name;
    private String sex;
    private int age;
    private String department;
    private String post;

    public Staff(String name, String sex, int age, String department, String post) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.department = department;
        this.post = post;
    }

    public Staff() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void introduce(){
        System.out.println("大家好！我叫"+getName()+",今年"+getAge()+"岁");
        System.out.println("我现在任职在"+getDepartment()+",是"+getDepartment()+getPost());
    }

}