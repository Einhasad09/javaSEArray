package homework0809.hw06;

public class Student implements Comparable<Student> {
    /**
     * * 6.由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，
     * 当输入的内容为exit退出；将输入的学生信息分别封装到一个Student对象中，
     * 再将每个Student对象加入到一个集合中，要求 集合 中的元素按照年龄大小正序排序；最后遍历集合，
     * 将集合中学生信息写入到记事本，每个学生数据占单独一行。
     * 推荐步骤：
     * a)创建Student类，并指定按照年龄正序排列
     * b)通过控制台输入多个不同Student信息。格式规定为：编号#姓名#年龄
     * c)取出字符串中相应信息放入Student对象，并将Student加入到集合中
     * d)遍历集合的过程中将学生的信息输入到记事本
     */
    private Integer num;
    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
