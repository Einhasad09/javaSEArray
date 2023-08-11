package com.demo1;

public class numberThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            System.out.println("NumThread 线程在运行"+i);
        }
    }
}
