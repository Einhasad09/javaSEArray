package com.demo3;

public class numRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行："+i);
        }
    }

}
