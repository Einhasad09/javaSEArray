package com.demo01;

import java.util.Comparator;
/**
 * 外部比较器的名字：comparator      compare
 * 内部比较器的名字：comparable      compareTo
 * */
public class StudentRanking implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1 == o2){//地址相等
            return 0;
        }
        if(o1.getStuName().compareTo(o2.getStuName())==0){//地址相等
            if(o1.getStuAge()>o2.getStuAge()){
                return 1;
            }else if(o1.getStuAge()<o2.getStuAge()){
                return -1;
            }else{
                return 0;
            }
        }else{
            return o1.getStuName().compareTo(o2.getStuName());
        }

    }
}
