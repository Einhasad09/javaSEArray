package com.demo3;

public class Test {
    public static void main(String[] args) {
        /*numRunnable numRunnable = new numRunnable();
        Thread thread = new Thread(numRunnable,"子线程");
        thread.start();

        for (int i = 0; i < 101; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+i);
        }*/
        Station station01 = new Station();
        Thread thread01 = new Thread(station01,"售票口1");
        thread01.start();
        Thread thread02 = new Thread(station01,"售票口2");
        thread02.start();
        Thread thread03 = new Thread(station01,"售票口3");
        thread03.start();
    }
}
