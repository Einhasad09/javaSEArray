package homework0809.hw02;

public class Student implements Comparable{
    /**
     * 功能1：定义方法public void listToMap( )将List中Student元素封装到Map中
     * 1)使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息并加入List
     * 2)遍历List，输出每个Student信息
     * 3)将List中数据放入Map，使用Student的id属性作为key，使用Student对象信息作为value
     * 4)遍历Map，输出每个Entry的key和value
     * 功能2：定义方法public void mapToList( )将Map中Value值Student信息封装到	List
     * 1)创建实体类StudentEntry，可以存储Map中每个Entry的信息
     * 2)使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息，
     * 并使用Student的id属性作为key，存入Map
     * 3)创建List对象，每个元素类型是StudentEntry
     * 4)将Map中每个Entry信息放入List对象
     * 功能3：说明Comparable接口的作用，并通过分数来对学生进行排序。
     * */
    private int id;
    private String name;
    private int age;
    private String sex;
    private int score;

    public Student(int id, String name, int age, String sex, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public Student() {
    }

    public Student(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        return this.age - s.age;
    }
}
