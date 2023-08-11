package homework0809.hw06.practicehw06;

public class Student implements Comparable<Student>{
    private Integer num;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(Integer num, String name, Integer age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
