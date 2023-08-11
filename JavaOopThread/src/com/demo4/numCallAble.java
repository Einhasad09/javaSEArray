package com.demo4;

import java.util.concurrent.Callable;

public class numCallAble implements Callable {
    @Override
    public Object call() throws Exception {
        int i = 1;
        for (i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + i);
        }
        return i; //自动装箱
    }
}
