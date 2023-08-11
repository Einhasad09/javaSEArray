package com.demo01;

import java.util.Comparator;

public class StuID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getStuId()==o2.getStuId()){
            return 0;
        }else if(o1.getStuId()>o2.getStuId()){
            return 1;
        }else{
            return -1;
        }

    }
}
