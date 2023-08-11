package com.demo02;

import java.util.Objects;

/**
 * comparable 内部比较器
 * 重写一个compareTo方法
 *
 * */
public class Student {
    private int stuId;
    private String stuName;
    private int stuAge;
    private String stuSex;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
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

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Student() {
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuId == student.stuId &&
                stuAge == student.stuAge &&
                Objects.equals(stuName, student.stuName) &&
                Objects.equals(stuSex, student.stuSex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, stuName, stuAge, stuSex);
    }
*/

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }

    public Student(int stuId, String stuName, int stuAge, String stuSex) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuSex = stuSex;
    }

/*    @Override
    public int compareTo(Student o) { //0 1 -1
        if(this==o){//地址相等
            return 0;
        }
        if(this.stuId==o.stuId){
            return 0;
        }
        if(this.stuId>o.stuId){//根据学号进行排序
            return 1;
        }else{
            return -1;
        }
    }*/
    /*@Override
    public int compareTo(Student o) { //0 1 -1
        if(this == o){//地址相等
            return 0;
        }
        if(stuName.compareTo(o.stuName) == 0){
            if(stuAge > o.stuAge){
                return 1;
            }else if(stuAge < o.stuAge){
                return -1;
            }else{
                return 0;
            }
        }else{
            return stuName.compareTo(o.stuName);
        }

    }*/

}
