package homework0810.h18w7;

import java.io.Serializable;

public class Student implements Serializable ,Comparable<Student>{
    private static final long serialVersionUID = 155229655887101647L;
    //学号，姓名，年龄信息
    private String stuId;
    private String stuName;
    private int stuAge;

    public Student() {
    }

    public Student(String stuId, String stuName, int stuAge) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.stuAge - o.getStuAge();
    }
}
